package com.qxglsys.formal.repository;

import com.qxglsys.formal.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminUser,Integer> {
    AdminUser findByUsernameAndPassword(String username,String password);
}
