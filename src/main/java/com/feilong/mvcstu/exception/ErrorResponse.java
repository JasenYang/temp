package com.feilong.mvcstu.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    private String errorTypeName;
    private String message;

    public ErrorResponse(Exception e) {
        this(e.getClass().getName(), e.getMessage());
    }
}
