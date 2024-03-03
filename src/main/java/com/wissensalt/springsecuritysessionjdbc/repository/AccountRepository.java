package com.wissensalt.springsecuritysessionjdbc.repository;

import com.wissensalt.springsecuritysessionjdbc.model.Account;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

  Optional<Account> findFirstByEmail(String email);
}
