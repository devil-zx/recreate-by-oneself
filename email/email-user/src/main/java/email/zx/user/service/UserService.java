package email.zx.user.service;


import email.zx.user.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {




    List<User> getAllUser();
}
