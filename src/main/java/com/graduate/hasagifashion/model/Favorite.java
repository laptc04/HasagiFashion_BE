package com.graduate.hasagifashion.model;

<<<<<<< Updated upstream
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "favorites")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
=======

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "favorites")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
>>>>>>> Stashed changes
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< Updated upstream
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

=======
    @OneToOne(mappedBy = "favorite")
    private Account account;

    @OneToMany(mappedBy = "favorite")
    private List<Product> products;
>>>>>>> Stashed changes
}
