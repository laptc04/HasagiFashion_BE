package com.graduate.hasagifashion.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

<<<<<<< Updated upstream
@Entity
@Table(name = "images")
=======
@Entity(name = "images")
>>>>>>> Stashed changes
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Image {
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String url;

<<<<<<< Updated upstream
    @ManyToOne
    @JoinColumn(name = "productDetail_id")
    private Product_Detail productDetail;

=======
    @OneToMany(mappedBy = "image")
    private List<Product_Detail> product_details;
>>>>>>> Stashed changes
}
