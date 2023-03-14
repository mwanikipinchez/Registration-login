package com.bytetech.Registration.login.repository;

import com.bytetech.Registration.login.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
