package hello.service;

import javax.inject.Inject;

/**
 * @author lx
 * @create_TIME 2020-02-29-20:15
 */
public class OrderService {

    private UserService userService;

    @Inject
    //依赖注入：OrderService依赖UserService
    public OrderService(UserService userService) {
        this.userService = userService;
    }
    public void placeOreder(Integer id, String name) {
        userService.getUserById(id);

    }

}



