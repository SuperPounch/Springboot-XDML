package hello.mapper;

import hello.service.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author lx
 * @create_TIME 2020-03-01-16:51
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM User WHERE id = #{id}")
    User findUserById(@Param("id") Integer id);

}