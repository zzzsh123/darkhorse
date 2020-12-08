package today.zsh.adminclientone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * author: zsh
 * date: 2020/12/8 14:59
 * description: sss
 **/
@RequestMapping("hello")
@RestController
public class Use {

    @RequestMapping("world")
    private String hello() {
        return "Hello World";
    }

}
