package com.utilitytracker.controller;

import com.utilitytracker.dto.utility.UtilityRequestDto;
import com.utilitytracker.dto.utility.UtilityResponseDto;
import com.utilitytracker.entity.User;
import com.utilitytracker.service.impl.UtilityServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/utility")
@RequiredArgsConstructor
public class UtilityController {

    private final UtilityServiceImpl utilityService;

    @PostMapping
    public UtilityResponseDto create(Authentication authentication,
                                     @RequestBody UtilityRequestDto requestDto) {
        User user = (User) authentication.getPrincipal();
        return utilityService.create(user, requestDto);
    }
}
