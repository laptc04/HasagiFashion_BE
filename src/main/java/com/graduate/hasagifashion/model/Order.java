package com.graduate.hasagifashion.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDateTime orderDate;

    @Column
    private String payStatus;

    @Column
    private String payMethod;

    @Column
    private int shippingFree;

    @Column
    private double amount;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "order")
    private List<Order_Detail> orderDetails;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Shipping_Status status;
}
