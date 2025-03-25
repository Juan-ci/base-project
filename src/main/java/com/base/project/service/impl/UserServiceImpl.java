package com.base.project.service.impl;

import com.base.project.dto.request.UserRequest;
import com.base.project.dto.response.UserResponse;
import com.base.project.entity.User;
import com.base.project.repository.IUserRepository;
import com.base.project.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);

    private final AuthenticationManager authenticationManager;

    private final JWTServiceImpl jwtService;

    @Autowired
    public UserServiceImpl(IUserRepository userRepository, AuthenticationManager authenticationManager, JWTServiceImpl jwtService) {
        this.userRepository = userRepository;
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
    }

    @Override
    public UserResponse registerUser(UserRequest userRequest) {
        User userEntity = userRepository.save(
                User.builder()
                        .role(userRequest.getRole())
                        .username(userRequest.getUsername())
                        .password(passwordEncoder.encode(userRequest.getPassword()))
                .build()
        );

        return UserResponse.builder()
                .idUser(userEntity.getIdUser())
                .username(userEntity.getUsername())
                .password(userEntity.getPassword())
                .role(userEntity.getRole())
                .build();
    }

    @Override
    public String verifyLogin(UserRequest user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())
        );

        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getUsername());
        } else {
            return "failed";
        }
    }
}
