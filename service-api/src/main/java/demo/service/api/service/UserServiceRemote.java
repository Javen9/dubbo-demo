package demo.service.api.service;

import demo.service.api.dto.UserAddrDTO;
import demo.service.api.dto.UserDTO;

/**
 * Created by javen on 2017/8/4.
 */
public interface UserServiceRemote {

    Integer createUser(UserDTO userDTO, UserAddrDTO userAddrDTO);

    String getUser();
}
