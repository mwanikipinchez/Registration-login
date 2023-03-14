package com.bytetech.Registration.login.repository;

import com.bytetech.Registration.login.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
