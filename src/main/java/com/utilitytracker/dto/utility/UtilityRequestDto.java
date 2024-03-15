package com.utilitytracker.dto.utility;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UtilityRequestDto {
    private int gas;
    private int water;
    private int electricity;
}
