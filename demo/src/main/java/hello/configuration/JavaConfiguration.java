package hello.configuration;

/**
 * @author lx
 * @create_TIME 2020-03-01-12:56
 */

import hello.mapper.UserMapper;
import hello.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    @Bean
    public UserService  userService(UserMapper userMapper) {
        return new UserService(userMapper);
    }

   /* @Bean
    public OrderService orderService() {
        return new OrderService(new UserService());
    }*/

}