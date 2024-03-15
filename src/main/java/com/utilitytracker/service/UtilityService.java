package com.utilitytracker.service;

import com.utilitytracker.dto.utility.UtilityRequestDto;
import com.utilitytracker.dto.utility.UtilityResponseDto;
import com.utilitytracker.entity.User;

public interface UtilityService {
    UtilityResponseDto create(User user, UtilityRequestDto dto);
}
