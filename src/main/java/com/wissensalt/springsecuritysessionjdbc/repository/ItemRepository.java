package com.wissensalt.springsecuritysessionjdbc.repository;

import com.wissensalt.springsecuritysessionjdbc.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
