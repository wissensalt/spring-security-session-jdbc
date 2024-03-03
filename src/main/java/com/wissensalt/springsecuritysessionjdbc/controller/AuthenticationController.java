package com.wissensalt.springsecuritysessionjdbc.controller;

import com.wissensalt.springsecuritysessionjdbc.param.LoginParam;
import com.wissensalt.springsecuritysessionjdbc.request.LoginRequest;
import com.wissensalt.springsecuritysessionjdbc.request.RegisterRequest;
import com.wissensalt.springsecuritysessionjdbc.response.AccountResponse;
import com.wissensalt.springsecuritysessionjdbc.service.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AuthenticationController {

  private final AccountService accountService;

  @PostMapping("/register")
  public Boolean register(@RequestBody @Valid RegisterRequest request) {

    return accountService.register(request);
  }

  @PostMapping("/login")
  public AccountResponse login(HttpServletRequest request, HttpServletResponse response, @RequestBody @Valid LoginRequest loginRequest) {

    return accountService.login(new LoginParam(request, response, loginRequest  ));
  }

  @GetMapping("/user")
  public String userApi() {

    return "Welcome User " + SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  }

  @GetMapping("/admin")
  public String adminApi() {

    return "Welcome Admin " + SecurityContextHolder.getContext().getAuthentication().getPrincipal();
  }
}
