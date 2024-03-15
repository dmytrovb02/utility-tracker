package com.utilitytracker.mapper;

import com.utilitytracker.config.MapperConfig;
import com.utilitytracker.dto.utility.UtilityRequestDto;
import com.utilitytracker.dto.utility.UtilityResponseDto;
import com.utilitytracker.entity.Utility;
import org.mapstruct.Mapper;

@Mapper(imports = MapperConfig.class, componentModel = "spring")
public interface UtilityMapper {

    Utility toEntity(UtilityRequestDto dto);

    UtilityResponseDto toDto(Utility utility);
}
