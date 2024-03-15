package com.utilitytracker.mapper;

import com.utilitytracker.config.MapperConfig;
import com.utilitytracker.dto.user.UserRegistrationRequestDto;
import com.utilitytracker.dto.user.UserResponseDto;
import com.utilitytracker.entity.User;
import org.mapstruct.Mapper;

@Mapper(imports = MapperConfig.class, componentModel = "spring")
public interface UserMapper {

    UserResponseDto mapToDto(User user);

    User mapToModel(UserRegistrationRequestDto requestDto);
}
