package com.graduate.hasagifashion.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orderDetails")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Order_Detail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int quantity;

    @Column
    private double price;

    @ManyToOne
    @JoinColumn(name = "productDetail_id")
    private Product_Detail productDetail;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
}
