package com.qxglsys.formal.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Builder
@Getter
@Setter
@ToString
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String addr;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private String password;

    @Column
    private String phone;

    @Column
    private String username;
}
