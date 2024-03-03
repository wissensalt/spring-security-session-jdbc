package com.wissensalt.springsecuritysessionjdbc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.context.AbstractHttpSessionApplicationInitializer;

@Configuration
public class SessionConfigInitializer extends AbstractHttpSessionApplicationInitializer {

  public SessionConfigInitializer() {
    super(SecurityConfig.class, SessionConfig.class);
  }
}
