package today.zsh.codition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CoditionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(CoditionApplication.class, args);

        /**
         * 获取redisTemplate Bean
         */
//        Object redisTemplate = run.getBean("redisTemplate");
//        System.out.println(redisTemplate);
        /**
         * 在Spring IOC容器中创建一个User Bean
         * 需求：需在有Jedis依赖的前提下，才导入User Bean
         */
        Object user = run.getBean("user2");
        System.out.println(user);



    }

}
