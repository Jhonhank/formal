package com.qxglsys.formal.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@Builder
@Table(name = "admin_user")
public class AdminUser {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String password;

    @Column
    private String username;
}
