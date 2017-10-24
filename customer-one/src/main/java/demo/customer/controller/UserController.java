package demo.customer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import demo.service.api.dto.UserAddrDTO;
import demo.service.api.dto.UserDTO;
import demo.service.api.service.UserServiceRemote;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by javen on 2017/8/4.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Reference
    private UserServiceRemote userService;

    @RequestMapping("createUser")
    public Integer createUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(12);
        userDTO.setName("user name");
        UserAddrDTO userAddrDTO = new UserAddrDTO();
        userAddrDTO.setId(13);
        userAddrDTO.setName("user addr");
        return userService.createUser(userDTO,userAddrDTO);
    }

    @RequestMapping("getUser")
    public String getUser() {
        return userService.getUser();
    }
}
