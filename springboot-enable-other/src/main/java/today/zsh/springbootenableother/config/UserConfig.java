package today.zsh.springbootenableother.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import today.zsh.springbootenableother.pojo.User;

/*
 * author: zsh
 * date: 2020/12/7 17:23
 * description: 用户Bean配置类
 **/
@Configuration
public class UserConfig {

    @Bean
    public User user() {
        return new User();
    }

}
