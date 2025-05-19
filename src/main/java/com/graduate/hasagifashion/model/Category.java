package com.graduate.hasagifashion.model;
<<<<<<< Updated upstream
<<<<<<<< Updated upstream:src/main/java/com/graduate/hasagifashion/model/Category.java
========

>>>>>>>> Stashed changes:src/main/java/com/graduate/hasagifashion/model/AbstractModel.java
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
<<<<<<<< Updated upstream:src/main/java/com/graduate/hasagifashion/model/Category.java
@Getter
@Setter
public class Category extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;
========
@Data
public class AbstractModel {
>>>>>>>> Stashed changes:src/main/java/com/graduate/hasagifashion/model/AbstractModel.java

    @OneToMany(mappedBy = "category")
    private List<Product> products;
=======

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Category extends AbstractModel {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long Id;

    @Column
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products = new ArrayList<>();
>>>>>>> Stashed changes
}
