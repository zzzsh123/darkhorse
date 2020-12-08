package today.zsh.springbootlistener.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;

/*
 * author: zsh
 * date: 2020/12/8 10:04
 * description: MyCommandLineRunner
 **/
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyCommandLineRunner...run...");
        System.out.println(Arrays.asList(args));
    }
}
