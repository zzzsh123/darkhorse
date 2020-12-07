package today.zsh.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
 * author: zsh
 * date: 2020/12/7 21:45
 * description: 读取redis开头相关配置文件
 **/
@ConfigurationProperties(prefix = "redis")
public class RedisProperties {

    private String host = "localhost";
    private int port = 6379;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
