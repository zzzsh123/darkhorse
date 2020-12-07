package today.zsh.enable;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import redis.clients.jedis.Jedis;
import today.zsh.springbootenableother.config.MyImportBeanDefinitionRegistrar;
import redis.clients.*;

import java.util.Map;

/**
 * 1. @ComponentScan 当前引导配置类所在包机器子包
 * today.zsh.enable
 * today.zsh.springbootenableother.config;
 * 扫描 today.zsh
 *
 * 2. @Import 加载类
 * 传入类名.class 会被Soring创建并放入IOC容器
 *
 * 3. @EnableUser
 * 提前配置需要自动注入Bean的启动类
 * 也是使用Import注解
 * (1)@Target({ElementType.TYPE})
 * (2)@Retention(RetentionPolicy.RUNTIME)
 * (3)@Documented
 * (4)@Import(***.class)
 *
 */

/**
 * Import注解的4中用法
 * 1、@Import(***.class)
 *   可使用getBean()
 *   参数可为 类名.class 或 键值
 *   类名.class获取Bean 可以直接获得
 *   键值获取Bean Bean的键值对 键值为包名加类名
 *
 * 2、导入配置类
 *   配置类中可包含多个Bean
 *   配置类上的@Configuration可不加
 *
 * 3、导入ImportSelector实现类
 *   编写一个自定义Selector 实现ImportSelector接口
 *   返回值中可自定义
 *   return new String[] {"today.zsh.springbootenableother.pojo.Role", "today.zsh.springbootenableother.pojo.User"};
 *   后期也可使用配置文件，动态实现
 *
 * 4、导入ImportBeanDefinitionRegistrar
 */


//@ComponentScan("today.zsh") 需要扫描包多的情况下，很麻烦，不推荐
//@Import(UserConfig.class)
//@EnableUser

//@Import(User.class)
//@Import(UserConfig.class)
//@Import(MyImportSelector.class)
//@Import(MyImportBeanDefinitionRegistrar.class)
@SpringBootApplication
public class EnableApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EnableApplication.class, args);
//        // 获取Bean
//        Object user = context.getBean("user");
//        System.out.println(user);

        // Import 1、
//        User bean = context.getBean(User.class);
//        Map<String, User> beansOfType = context.getBeansOfType(User.class);
//                Object user = context.getBean("today.zsh.springbootenableother.pojo.User");
//        System.out.println(user);
//        System.out.println(beansOfType);

//        // Import 2、Import 引入配置类
//        User bean = context.getBean(User.class);    // today.zsh.springbootenableother.pojo.User@a87f8ec
//        User user = (User) context.getBean("user");    // today.zsh.springbootenableother.pojo.User@a87f8ec
//        Role r = (Role) context.getBean("role");    // today.zsh.springbootenableother.pojo.Role@5443d039
//        Role role = context.getBean(Role.class);    // today.zsh.springbootenableother.pojo.Role@5443d039
////        Object user = context.getBeansOfType(User.class);  {user=today.zsh.springbootenableother.pojo.User@a87f8ec}
//
//        System.out.println(bean);
//        System.out.println(user);
//        System.out.println(role);
//        System.out.println(r);
//
        // Import 3、
//        User bean = context.getBean(User.class);    // today.zsh.springbootenableother.pojo.User@7e4204e2
//        User user = (User) context.getBean("user");    // today.zsh.springbootenableother.pojo.User@7e4204e2
//        Role role = (Role) context.getBean("role");    // today.zsh.springbootenableother.pojo.User@7e4204e2
//        Role r = (Role) context.getBean("today.zsh.springbootenableother.pojo.Role");    // today.zsh.springbootenableother.pojo.Role@1c481ff2
//        Role role = context.getBean(Role.class);    // today.zsh.springbootenableother.pojo.Role@1c481ff2
//        Object s = context.getBeansOfType(User.class);  //{user=today.zsh.springbootenableother.pojo.User@7e4204e2}
//
//        System.out.println(s);
//        System.out.println(bean);
//        System.out.println(user);
//        System.out.println(role);
//        System.out.println(r);

        // 自定义redis - starter
        Jedis jedis = context.getBean(Jedis.class);
        jedis.set("hello", "world");
        String hello = jedis.get("hello");
        System.out.println(hello);
        System.out.println(jedis);
    }

    /**
     * 会使自定义的RedisAutoConfiguration中的ConditionalOnMissingBean触发不再运行
     */
    @Bean
    Jedis jedis(){
        return new Jedis("localhost", 6379);
    }

}
