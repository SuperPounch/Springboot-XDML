package hello;

import hello.service.User;
import hello.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
public class HelloController {
    /*private OrderService orderService;*/
    private UserService userService;
/*
    @Inject
    public HelloController(OrderService orderService) {
        this.orderService = orderService;
    }*/

    @Inject
    public HelloController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public User index() {
        return this.userService.getUserById(1);
    }

}