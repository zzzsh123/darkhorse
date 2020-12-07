package today.zsh.springbootenableother.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/*
 * author: zsh
 * date: 2020/12/7 20:49
 * description: importSelector
 **/
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[] {"today.zsh.springbootenableother.pojo.Role", "today.zsh.springbootenableother.pojo.User"};
    }
}
