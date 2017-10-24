package demo.service.api.dto;

import java.io.Serializable;

/**
 * Created by javen on 2017/8/4.
 */
public class UserDTO implements Serializable{

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
