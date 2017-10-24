package demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import demo.service.api.dto.UserAddrDTO;
import demo.service.api.dto.UserDTO;
import demo.service.api.service.UserServiceRemote;

/**
 * Created by javen on 2017/8/4.
 */
@Service(protocol = "http")
public class UserService implements UserServiceRemote {

    public Integer createUser(UserDTO userDTO, UserAddrDTO userAddrDTO) {
        return 1;
    }

    public String getUser() {
        return "success";
    }
}
