package com.lucas.servertwo.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("api/")
public class TestController {

    @GetMapping("two")
    public ResponseEntity<String> mainGet() {
        return new ResponseEntity<>("Server Two", HttpStatus.OK);
    }

    // path 에서 open 을 본다면 다른서버와의 비중을 다르게 둘 수 있음
    @GetMapping("open")
    public ResponseEntity<String> openGet() {
        return new ResponseEntity<>("Server Two", HttpStatus.OK);
    }
}
