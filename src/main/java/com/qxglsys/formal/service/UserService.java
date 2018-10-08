package com.qxglsys.formal.service;

import com.qxglsys.formal.entity.User;
import com.qxglsys.formal.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
