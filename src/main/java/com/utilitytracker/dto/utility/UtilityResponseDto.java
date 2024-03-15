package com.utilitytracker.dto.utility;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class UtilityResponseDto {
    private Long id;
    private int gas;
    private int water;
    private int electricity;
    private LocalDateTime recordedAt;
}
