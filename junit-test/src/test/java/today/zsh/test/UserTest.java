package today.zsh.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import today.zsh.junittest.JunitTestApplication;
import today.zsh.junittest.service.UserService;

/*
 * author: zsh
 * date: 2020/12/4 15:18
 * description: 测试添加用户方法
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JunitTestApplication.class)
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void testUserAdd() {
        userService.userAdd();
    }


}
