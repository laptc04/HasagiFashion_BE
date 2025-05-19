package com.graduate.hasagifashion.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Nationalized;

import java.util.List;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Nationalized
    private String fullNameAddress;

    @Column
    private String numberPhone;

    @Nationalized
    private String provinceID;

    @Nationalized
    private String districtCode;

    @Nationalized
    private String wardCode;

    @Column
    private boolean status;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany(mappedBy = "address")
    private List<Order> orders;
}
