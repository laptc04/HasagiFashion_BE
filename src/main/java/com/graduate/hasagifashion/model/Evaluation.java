package com.graduate.hasagifashion.model;

<<<<<<< Updated upstream
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "evaluations")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
=======

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "evaluations")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
>>>>>>> Stashed changes
@Data
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

<<<<<<< Updated upstream
    @Column
    private int star;

    @Column
    private String description;

    @OneToOne(mappedBy = "evaluation")
    private Account account;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

=======
    @Column(unique = true, nullable = false)
    private int star;
    
    @Column
    private String description;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

>>>>>>> Stashed changes
}
