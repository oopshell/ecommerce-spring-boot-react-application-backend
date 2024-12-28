package me.tiantian_li.ecommerce.dto;

import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
////@Data
//@Getter
//@Setter
@Setter
@Getter
public class LoginRequest {
    private String email;
    private String password;

    public LoginRequest() {
        this.email = null;
        this.password = null;
    }

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
