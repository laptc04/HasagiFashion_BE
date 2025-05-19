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
@Table(name = "trademarks")
=======
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "trademarks")
>>>>>>> Stashed changes
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
<<<<<<< Updated upstream
public class Trademark {
=======
public class Trademark extends AbstractModel {
>>>>>>> Stashed changes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< Updated upstream
    @Column
    private String name;

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

    @OneToMany(mappedBy = "trademark")
    private List<Product> products;
=======
    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany(mappedBy = "trademark")
    private List<Product> products = new ArrayList<>();
>>>>>>> Stashed changes
}
