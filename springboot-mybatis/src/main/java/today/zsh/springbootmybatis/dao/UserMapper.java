package today.zsh.springbootmybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import today.zsh.springbootmybatis.pojo.Users;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<Users> queryAllUsers();

}
