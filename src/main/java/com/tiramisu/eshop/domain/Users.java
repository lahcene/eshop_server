package com.tiramisu.eshop.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by lahcen on 4/5/17.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public class Users {
    @Id
    @GeneratedValue
    @Column(name = "UserID")
    private int userId;

    @Column(name = "UserEmail")
    private String userEmail;

    @Column(name = "UserFirstName")
    private String userFirstName;

    @Column(name = "UserLastName")
    private String userLastName;

    @Column(name = "UserPassword")
    private String userPassword;


}
