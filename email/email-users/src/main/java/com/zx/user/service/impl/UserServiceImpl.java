package com.zx.user.service.impl;

import com.zx.user.dao.UserMapperTwo;
import com.zx.user.model.User;
import com.zx.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {



    @Autowired
    UserMapperTwo userMapperTwo;

    @Override
    public List<User> getAllUser() {
        return userMapperTwo.findAll();
    }
}
