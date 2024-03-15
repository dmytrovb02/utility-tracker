package com.utilitytracker.service.impl;

import com.utilitytracker.dto.utility.UtilityRequestDto;
import com.utilitytracker.dto.utility.UtilityResponseDto;
import com.utilitytracker.entity.User;
import com.utilitytracker.entity.Utility;
import com.utilitytracker.mapper.UtilityMapper;
import com.utilitytracker.repository.UtilityRepository;
import com.utilitytracker.service.UtilityService;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UtilityServiceImpl implements UtilityService {

    private final UtilityRepository utilityRepository;
    private final UtilityMapper utilityMapper;

    @Override
    public UtilityResponseDto create(User user, UtilityRequestDto dto) {
        Utility utility = utilityMapper.toEntity(dto);
        utility.setUser(user);
        utility.setRecordedAt(LocalDateTime.now());
        utilityRepository.save(utility);
        return utilityMapper.toDto(utility);
    }
}
