package today.zsh.springbootenableother.config;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import today.zsh.springbootenableother.pojo.Role;
import today.zsh.springbootenableother.pojo.User;

/*
 * author: zsh
 * date: 2020/12/7 20:57
 * description: myImportBeanDefinitionRegistrar
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
        AbstractBeanDefinition beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(User.class).getBeanDefinition();
        AbstractBeanDefinition roleBeanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Role.class).getBeanDefinition();
        registry.registerBeanDefinition("user", beanDefinitionBuilder);
        registry.registerBeanDefinition("role", roleBeanDefinitionBuilder);
    }
}
