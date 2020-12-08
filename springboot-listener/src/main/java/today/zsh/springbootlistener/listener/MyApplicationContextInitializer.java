package today.zsh.springbootlistener.listener;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/*
 * author: zsh
 * date: 2020/12/8 9:57
 * description: MyApplicationContextInitializer
 **/
@Component
public class MyApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("ApplicationContextInitializer...initialize```");
    }
}
