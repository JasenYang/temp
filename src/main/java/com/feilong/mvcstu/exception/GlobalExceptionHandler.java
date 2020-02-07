package com.feilong.mvcstu.exception;

import com.feilong.mvcstu.controller.ExceptionController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice(assignableTypes = {ExceptionController.class})
//@ResponseBody
public class GlobalExceptionHandler {
    ErrorResponse illegalArgumentResponse = new ErrorResponse(new IllegalArgumentException("参数错误"));
    ErrorResponse resourseNotFoundResponse = new ErrorResponse(new ResourceNotFoundException("Sorry, the resourse not found!"));

    @ExceptionHandler(value = IllegalAccessError.class)
    public ResponseEntity<ErrorResponse> exceptionHandler_illegalAccessError(Exception e) {
        return ResponseEntity.status(400).body(illegalArgumentResponse);
    }
}
