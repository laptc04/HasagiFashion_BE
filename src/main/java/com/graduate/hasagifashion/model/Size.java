package com.graduate.hasagifashion.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

<<<<<<< Updated upstream
@Entity
@Table(name = "sizes")
=======
@Entity(name = "sizes")
>>>>>>> Stashed changes
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
<<<<<<< Updated upstream
    private String size;

    @OneToMany(mappedBy = "size")
    private List<Product_Detail> productDetails;
=======
    private String name;

    @OneToMany(mappedBy = "size")
    private List<Product_Detail> product_details;
>>>>>>> Stashed changes
}
