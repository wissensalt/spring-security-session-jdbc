package com.wissensalt.springsecuritysessionjdbc.param;

import com.wissensalt.springsecuritysessionjdbc.request.LoginRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public record LoginParam(HttpServletRequest request, HttpServletResponse response, LoginRequest loginRequest) {

}
