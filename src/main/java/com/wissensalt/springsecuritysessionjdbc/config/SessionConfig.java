package com.wissensalt.springsecuritysessionjdbc.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;
import org.springframework.session.web.http.HeaderHttpSessionIdResolver;
import org.springframework.session.web.http.HttpSessionIdResolver;

@Configuration
@EnableJdbcHttpSession
public class SessionConfig {

  @Bean
  @Qualifier("httpSessionIdResolver")
  public HttpSessionIdResolver httpSessionIdResolver() {

    return HeaderHttpSessionIdResolver.xAuthToken();
  }

}
