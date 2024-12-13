package com.david.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class LoginController {
    @GetMapping(value = "/login")
    public String login() {
        log.info("GET /login");
        return "login";
    }
}
