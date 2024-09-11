package com.construcao.software.formApi.exception;

import java.time.LocalDateTime;

public record ErrorResponse(
        String message,
        String details,
        LocalDateTime timestamp,
        int status
) {
}
