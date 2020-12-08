package today.zsh.springbootlistener.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/*
 * author: zsh
 * date: 2020/12/8 9:59
 * description: MySpringApplicationRunListener
 **/
public class MySpringApplicationRunListener implements SpringApplicationRunListener {

    public MySpringApplicationRunListener(SpringApplication application, String[] args) {
        System.currentTimeMillis();
    }

    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("starting...项目启动中");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("environmentPrepared...配镜对象开始准备");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("contextPrepared...上下文对象开始准备");

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("contextLoaded...上下文对象开始加载");

    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("started...上下文对象已加载完毕");

    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("running...项目运行中");

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("failed...启动失败");

    }
}
