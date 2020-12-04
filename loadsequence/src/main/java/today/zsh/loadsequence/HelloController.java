package today.zsh.loadsequence;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * author: zsh
 * date: 2020/12/4 14:23
 * description: hello
 **/
@RestController
public class HelloController {

    @RequestMapping("hello")
    private String hello() {
        return "hello";
    }

}
