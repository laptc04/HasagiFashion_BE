package com.graduate.hasagifashion.model;


import jakarta.persistence.*;
import lombok.*;

@Entity(name = "cartDetail")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cart_Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private int quantity;

    @Column
    private double price;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
}
