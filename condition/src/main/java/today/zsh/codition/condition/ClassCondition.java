package today.zsh.codition.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.MultiValueMap;

import java.util.Map;

/*
 * author: zsh
 * date: 2020/12/7 14:44
 * description: 字节码文件Condition
 **/
public class ClassCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        boolean flag = true;
//        // 1.有Jedis依赖，才返回User Bean
//        try {
//            Class.forName("redis.clients.jedis.Jedis");
//        } catch (ClassNotFoundException e) {
//            flag=false;
//            e.printStackTrace();
//        }
//        return flag;
        /**
         *
         */
        // 2.有目标值依赖，才返回User Bean
        Map<String, Object> map = metadata.getAnnotationAttributes(ConditionClass.class.getName());
        String [] value = (String[]) map.get("value");
        try {
            for (String v : value)
            Class.forName(v);
        } catch (ClassNotFoundException e) {
            flag=false;
            e.printStackTrace();
        }
        return flag;
    }
}
