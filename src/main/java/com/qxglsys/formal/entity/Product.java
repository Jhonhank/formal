package com.qxglsys.formal.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@ToString
@Getter
@Setter
@Component
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @Column
    private Integer csid;

    @Column
    private String desc;

    @Column
    private String image;

    @Column
    private Integer isHot;

    @Column
    private Double marketPrice;

    @Column
    private Date pdate;

    @Column
    private String title;

    @Column
    private Double shopPrice;
}
