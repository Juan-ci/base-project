package com.base.project.service.impl;

import com.base.project.entity.User;
import com.base.project.entity.UserPrincipal;
import com.base.project.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private final IUserRepository IUserRepository;

    @Autowired
    public MyUserDetailsService(IUserRepository IUserRepository) {
        this.IUserRepository = IUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = IUserRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Username not found.");
        }

        return new UserPrincipal(user);
    }
}
