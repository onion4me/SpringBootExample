package fun.czrj.springboot_example.controller;

import fun.czrj.springboot_example.dao.UserRepository;
import fun.czrj.springboot_example.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhangjian
 * @email zhangjian@czrj.fun
 * @date 2020/4/12
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserRepository userRepository;

   @GetMapping("/findUserList")
    public List<User>  findUserList(){
        return userRepository.findAll();
    }
}
