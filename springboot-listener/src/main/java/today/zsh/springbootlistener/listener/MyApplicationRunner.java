package today.zsh.springbootlistener.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/*
 * author: zsh
 * date: 2020/12/8 10:05
 * description: MyApplicationRunner
 **/
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("MyApplicationRunner...run...");
        System.out.println(Arrays.asList(args.getSourceArgs()));
    }
}
