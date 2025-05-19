package com.graduate.hasagifashion.model;

import jakarta.persistence.*;
import lombok.*;

<<<<<<< Updated upstream
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "products")
=======
import java.util.List;

@Entity(name = "products")
>>>>>>> Stashed changes
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
<<<<<<< Updated upstream
public class Product {

=======
public class Product extends AbstractModel {
>>>>>>> Stashed changes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

<<<<<<< Updated upstream
    @Column
    private int importQuantity;

    @Column
    private double importPrice;
=======
    @Column(name = "importPrice")
    private Double importPrice;

    @Column
    private int total;

    @Column
    private String image;
>>>>>>> Stashed changes

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

    @ManyToOne
    @JoinColumn(name = "trademark_id")
    private Trademark trademark;

    @OneToMany(mappedBy = "product")
    private List<Product_Detail> productDetails;

    @OneToMany(mappedBy = "product")
    private List<Evaluation> evaluations;

    @OneToMany(mappedBy = "product")
    private List<Favorite> favorites;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

=======
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trademark_id")
    private Trademark trademark;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<Product_Detail> product_details;

    @ManyToOne
    @JoinColumn(name = " favorite_id")
    private Favorite favorite;
>>>>>>> Stashed changes
}
