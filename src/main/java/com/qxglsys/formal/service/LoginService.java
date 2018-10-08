package com.qxglsys.formal.service;

import com.qxglsys.formal.entity.AdminUser;
import com.qxglsys.formal.repository.AdminRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {

    @Resource
    private AdminRepository adminRepository;

    public AdminUser checkLogin(String uName, String pwd){
        return adminRepository.findByUsernameAndPassword(uName,pwd);
    }
}
