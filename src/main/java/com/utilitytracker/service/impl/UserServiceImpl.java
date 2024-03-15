package com.utilitytracker.service.impl;

import com.utilitytracker.dto.user.UserRegistrationRequestDto;
import com.utilitytracker.dto.user.UserResponseDto;
import com.utilitytracker.entity.User;
import com.utilitytracker.exception.EntityNotFoundException;
import com.utilitytracker.exception.RegistrationException;
import com.utilitytracker.mapper.UserMapper;
import com.utilitytracker.repository.UserRepository;
import com.utilitytracker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public UserResponseDto register(UserRegistrationRequestDto requestDto) {
        if (userRepository.findByEmail(requestDto.getEmail()).isPresent()) {
            throw new RegistrationException("Email already registered");
        }
        User newUser = userMapper.mapToModel(requestDto);
        newUser.setPassword(passwordEncoder.encode(requestDto.getPassword()));
        userRepository.save(newUser);

        return userMapper.mapToDto(newUser);
    }

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(
                        () -> new EntityNotFoundException("Can't find user by email: " + email));
    }
}
