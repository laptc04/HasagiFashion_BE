package com.graduate.hasagifashion.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Entity
@Table(name = "accounts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Account {
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "firstName")
    String firstName;

    @Column(name = "lastName")
    String lastName;

    @Column(unique = true, nullable = false)
    String email;

    @Column
    String password;

    @Column
    String avatar;

    @Column
    Boolean isDeleted = false;

    @ManyToOne
    @JoinColumn(name = "role_id")
    Role role;

<<<<<<< Updated upstream
    @OneToOne(mappedBy = "account")
    private Cart_Detail cartDetail;

    @OneToOne(mappedBy = "account")
    private Token token;

    @OneToOne
    @JoinColumn(name = "evaluation_id")
    private Evaluation evaluation;

    @OneToMany(mappedBy = "account")
    private List<Favorite> favorites;

    @OneToMany(mappedBy = "account")
    private List<Address> addresses;

    public Account(Long id, String fullName, String email, String password, String avatar, boolean isDeleted) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.isDeleted = isDeleted;
    }

=======
    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private Token token;

    @OneToOne
    @JoinColumn(name = "favorite_id")
    private Favorite favorite;

    @OneToOne(mappedBy = "account")
    private Evaluation evaluation;

    @OneToOne(mappedBy = "account")
    private Cart cart;
>>>>>>> Stashed changes
}
