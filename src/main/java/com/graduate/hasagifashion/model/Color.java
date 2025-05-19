package com.graduate.hasagifashion.model;

import jakarta.persistence.*;
<<<<<<< Updated upstream
=======
import jdk.dynalink.linker.LinkerServices;
>>>>>>> Stashed changes
import lombok.*;

import java.util.List;

<<<<<<< Updated upstream
@Entity
@Table(name = "colors")
=======
@Entity(name = "colors")
>>>>>>> Stashed changes
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< Updated upstream
    @Column
    private String color;

    @OneToMany(mappedBy = "color")
    private List<Product_Detail> productDetails;
=======
    @Column(unique = true, nullable = false)
    private String color;

    @OneToMany(mappedBy = "color")
    private List<Product_Detail> product_details;
>>>>>>> Stashed changes
}
