package com.graduate.hasagifashion.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

<<<<<<< Updated upstream
@Entity
@Table(name = "tokens")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Token {

=======
@Entity(name = "tokens")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Token {
>>>>>>> Stashed changes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String token;

    @Column
    private Timestamp expiryDate;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
}
