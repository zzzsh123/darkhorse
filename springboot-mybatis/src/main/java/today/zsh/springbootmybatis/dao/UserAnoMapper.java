package today.zsh.springbootmybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import today.zsh.springbootmybatis.pojo.Users;

import java.util.List;

@Repository
@Mapper
public interface UserAnoMapper {

    @Select("SELECT * FROM t_users")
    List<Users> queryAllUsers();

}
