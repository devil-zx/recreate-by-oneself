package email.zx.user.service.impl;

import email.zx.user.dao.UserMapper;
import email.zx.user.model.User;
import email.zx.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.selecetAllUser();
    }
}
