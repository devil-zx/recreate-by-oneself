package email.zx.user.controller;

import email.zx.user.model.User;
import email.zx.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/go")
    public Object test(){
        List<User> allUser = userService.getAllUser();
        return allUser;
    }


}
