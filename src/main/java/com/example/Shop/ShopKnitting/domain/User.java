package com.example.Shop.ShopKnitting.domain;

import com.example.Shop.ShopKnitting.Enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Table(name = "users")
public class User{
    private static final String SEQ_NAME = "user_seq";

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password", length = 1000)
    private String password;

    @Column(name = "roles")
    private String roles;

    @OneToOne(cascade = CascadeType.REMOVE)
    private Bucket bucket;

    @OneToMany(mappedBy = "user")
    private List<Order> orderList;
}
