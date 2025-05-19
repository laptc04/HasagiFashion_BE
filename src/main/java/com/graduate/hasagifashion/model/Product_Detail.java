package com.graduate.hasagifashion.model;

import jakarta.persistence.*;
<<<<<<< Updated upstream
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "productDetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product_Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
=======
import lombok.*;

import java.util.Collection;
import java.util.List;

@Entity(name = "productDetail")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product_Detail extends AbstractModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int quantity;

    @Column
>>>>>>> Stashed changes
    private double price;

    @Column
    private String description;

<<<<<<< Updated upstream
    @Column(name = "createDate")
    @Temporal(TemporalType.TIMESTAMP)
    Timestamp createDate;

    @Column(name = "modifyDate")
    @Temporal(TemporalType.TIMESTAMP)
    Timestamp modifyDate;

    @Column(name = "createBy")
    String createBy;

    @Column(name = "modifyBy")
    String modifyBy;
=======
    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;
    
    @ManyToOne
    @JoinColumn(name = "size_id")
    private Size size;
    
    @ManyToOne
    @JoinColumn(name = "image_id")
    private Image image;
>>>>>>> Stashed changes

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

<<<<<<< Updated upstream
    @ManyToOne
    @JoinColumn(name = "color_id")
    private Color color;

    @ManyToOne
    @JoinColumn(name = "size_id")
    private Size size;

    @OneToMany(mappedBy = "productDetail")
    private List<Image> images;

    @OneToMany(mappedBy = "productDetail")
    private List<Cart_Detail> cartDetails;

    @OneToMany(mappedBy = "productDetail")
    private List<Order_Detail> orderDetails;
=======
>>>>>>> Stashed changes
}
