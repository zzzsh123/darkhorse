package today.zsh.enable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ComponentScan
 *
 */
@SpringBootApplication
@ComponentScan("today.zsh")
public class EnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EnableApplication.class, args);
        Object user = context.getBean("User");
        System.out.println(user);
    }

}
