package com.qxglsys.formal.repository;

import com.qxglsys.formal.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
