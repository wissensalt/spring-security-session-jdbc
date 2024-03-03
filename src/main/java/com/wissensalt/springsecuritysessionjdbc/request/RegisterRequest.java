package com.wissensalt.springsecuritysessionjdbc.request;

import com.wissensalt.springsecuritysessionjdbc.model.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RegisterRequest(
    @NotBlank
    String email,
    @NotBlank
    String password,
    @NotNull
    Role.RoleName role) {

}
