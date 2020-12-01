package today.zsh.black.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import today.zsh.black.pojo.Person;

/*
 * author: zsh
 * date: 11/30/2020 9:51 PM
 * description: hello dark horse trip
 **/
@RestController
public class HelloController {

    @Value("${name}")
    private String hello;

    @Value("${person.name}")
    private String pName;

    @Value("${address[0]}")
    private String address1;

    @Value("${msg2}")
    private String msg2;

    @Value("${msg1}")
    private String msg1;

    @Value("${msg3}")
    private String msg3;

    @Autowired
    private Environment env;

    @Autowired
    private Person p;

    @RequestMapping("hello")
    private String hello(){
        System.out.println(hello);
        System.out.println(pName);
        System.out.println(address1);
        System.out.println(msg2);
        System.out.println(msg1);
        System.out.println(msg3);
        System.out.println(" -------- env -------- ");
        System.out.println(env.getProperty("msg3"));
        System.out.println(env.getProperty("msg2"));
        System.out.println(env.getProperty("address[0]"));
        System.out.println(env.getProperty("person.name"));
        System.out.println(" --------- configure ------- ");
        System.out.println(p.getName());
        System.out.println(p.getAge());
        System.out.println(p.toString());
        return "Hello, dark horse trip";
    }

}
