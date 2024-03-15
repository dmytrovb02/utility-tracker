package com.utilitytracker.service;

import com.utilitytracker.dto.user.UserRegistrationRequestDto;
import com.utilitytracker.dto.user.UserResponseDto;

public interface UserService {

    UserResponseDto register(UserRegistrationRequestDto requestDto);
}
