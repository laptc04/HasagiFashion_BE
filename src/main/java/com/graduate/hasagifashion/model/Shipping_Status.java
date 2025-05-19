package com.graduate.hasagifashion.model;

<<<<<<< Updated upstream

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "status")
=======
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "shippingStatus")
>>>>>>> Stashed changes
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Shipping_Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
<<<<<<< Updated upstream

    @Column
    private String status;

    @OneToMany(mappedBy = "status")
    private List<Order> orders;

=======
>>>>>>> Stashed changes
}
