package com.base.project.service;

import com.base.project.dto.request.UserRequest;
import com.base.project.dto.response.UserResponse;

public interface IUserService {

    UserResponse registerUser(UserRequest userRequest);

    String verifyLogin(UserRequest user);
}
