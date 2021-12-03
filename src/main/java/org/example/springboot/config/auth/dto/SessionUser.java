package org.example.springboot.config.auth.dto;

import lombok.Getter;
import org.example.springboot.domain.user.User;

import java.io.Serializable;

// User 클래스에 직렬화를 구현하지 않고 DTO에 직렬화를 구현하여 사용
@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
