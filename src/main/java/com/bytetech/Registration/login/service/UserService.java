package com.bytetech.Registration.login.service;

import com.bytetech.Registration.login.dto.UserDto;
import com.bytetech.Registration.login.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
