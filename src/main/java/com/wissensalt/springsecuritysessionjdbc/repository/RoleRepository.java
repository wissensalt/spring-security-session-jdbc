package com.wissensalt.springsecuritysessionjdbc.repository;

import com.wissensalt.springsecuritysessionjdbc.model.Role;
import com.wissensalt.springsecuritysessionjdbc.model.Role.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {

  Optional<Role> findFirstByName(RoleName name);
}
