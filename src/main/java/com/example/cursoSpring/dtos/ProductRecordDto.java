package com.example.cursoSpring.dtos;





import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record ProductRecordDto( String name, BigDecimal value) {
}
