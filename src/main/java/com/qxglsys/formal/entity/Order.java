package com.qxglsys.formal.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@Builder
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private String addr;

    @Column
    private String name;

    @Column
    private Date order_time;

    @Column
    private String phone;

    @Column
    private Integer state;

    @Column
    private Double total;

    @Column
    private Integer userId;
}
