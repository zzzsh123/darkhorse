package today.zsh.springbootdeploy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * author: zsh
 * date: 2020/12/8 15:19
 * description: yonghu
 **/
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("findAllUser")
    private String findAllUser() {
        return "user:{name: 'qwe',age: '22'}";
    }

}
