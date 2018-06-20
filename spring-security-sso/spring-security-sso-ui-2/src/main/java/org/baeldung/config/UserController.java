package org.baeldung.config;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author 1016823429@qq.com
 * date 2018/6/20
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("get")
    public User getUser() {
        return new User("sdfgk");
    }
}
