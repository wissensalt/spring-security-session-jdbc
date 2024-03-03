package com.wissensalt.springsecuritysessionjdbc.service;

import com.wissensalt.springsecuritysessionjdbc.param.LoginParam;
import com.wissensalt.springsecuritysessionjdbc.request.RegisterRequest;
import com.wissensalt.springsecuritysessionjdbc.response.AccountResponse;

public interface AccountService {

  Boolean register(RegisterRequest request);

  AccountResponse login(LoginParam loginParam);
}
