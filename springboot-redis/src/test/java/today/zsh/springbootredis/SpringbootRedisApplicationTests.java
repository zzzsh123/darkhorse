package today.zsh.springbootredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class SpringbootRedisApplicationTests {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Test
	void testSet() {
		redisTemplate.boundValueOps("name").set("hello");
	}

	@Test
	void testGet() {
		String name = redisTemplate.boundValueOps("name").get();
		System.out.println(name + " ---- name");
	}

}
