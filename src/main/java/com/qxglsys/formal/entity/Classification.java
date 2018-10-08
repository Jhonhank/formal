package com.qxglsys.formal.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@ToString
@Table(name = "classification")
public class Classification {
    /*
    * 返回数据库字段值是null的话，int类型会报错。
    * int是基本数据类型，其声明的是变量，
    * 而null则是对象。所以建议用integer；
    * */
    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String cname;

    @Column
    private Integer parentId;

    @Column
    private Integer type;
}
