package com.base.project.dto.request;

import lombok.Data;

@Data
public class UserRequest {

    private Long idUser;

    private String username;

    private String contrasena;

    private String rol;
}
