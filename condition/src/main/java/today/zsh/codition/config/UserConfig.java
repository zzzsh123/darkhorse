package today.zsh.codition.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import today.zsh.codition.condition.ClassCondition;
import today.zsh.codition.condition.ConditionClass;
import today.zsh.codition.pojo.User;

/*
 * author: zsh
 * date: 2020/12/7 14:35
 * description: 用户配置类
 **/
@Configuration
public class UserConfig {

//    @Conditional(ClassCondition.class)
//    @Bean
//    @ConditionClass("redis.clients.jedis.Jedis")
//    public User user(){
//        return new User();
//    }

    @Bean
    @ConditionalOnProperty(havingValue = "qwe", name = "name")
    public User user2(){
        return new User();
    }

}
