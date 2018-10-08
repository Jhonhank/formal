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
@Table(name = "order_item")
public class OrderItem {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private Integer count;

    @Column
    private Integer orderId;

    @Column
    private Integer productId;

    @Column
    private Double subTotal;
}
