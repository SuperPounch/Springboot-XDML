package hello.service;

import hello.mapper.UserMapper;

import javax.inject.Inject;

/**
 * @author lx
 * @create_TIME 2020-02-29-20:15
 */
public class UserService {
    private UserMapper userMapper;

    @Inject
    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User getUserById(Integer id){
        return userMapper.findUserById(id);

    }
}
