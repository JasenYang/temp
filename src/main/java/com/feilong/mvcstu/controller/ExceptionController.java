package com.feilong.mvcstu.controller;

import com.feilong.mvcstu.exception.ResourceNotFoundException;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ExceptionController {
    @GetMapping("/illegalArgumentException")
    @SneakyThrows
    public void throwException() {
        throw new IllegalAccessException();
    }

    @GetMapping("/resourceNotFoundException")
    public void throwException2(){
        throw new ResourceNotFoundException();
    }
}
