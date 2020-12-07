package today.zsh.springbootmybatis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import today.zsh.springbootmybatis.dao.UserAnoMapper;
import today.zsh.springbootmybatis.dao.UserMapper;
import today.zsh.springbootmybatis.pojo.Users;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private UserAnoMapper UserAnoMapper;

	@Test
	void contextLoads() {
		List<Users> users = userMapper.queryAllUsers();
//		List<Users> users = UserAnoMapper.queryAllUsers();
		for (Users user : users) {
			System.out.println(user.toString());
		}
	}

}
