package com.tiramisu.eshop.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by lahcen on 4/5/17.
 */
@Entity
@Table(name = "customer", catalog = "ecommerce")
@PrimaryKeyJoinColumn(name = "UserID")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer extends Users {
    
    @Column(name = "UserAddress")
    private String userAddress;
    
    @Column(name = "UserAddress2")
    private String userAddress2;
    
    @Column(name = "UserCity")
    private String userCity;
    
    @Column(name = "UserCountry")
    private String userCountry;
    
    @Column(name = "UserEmailVerified")
    private Boolean userEmailVerified;
    
    @Column(name = "UserPhone")
    private String userPhone;
    
    @Column(name = "UserRegistrationDate")
    private LocalDate userRegistrationDate;
    
    @Column(name = "UserState")
    private String userState;
    
    @Column(name = "UserVerificationCode")
    private String userVerificationCode;
    
    @Column(name = "UserZip")
    private String userZip;

    @OneToMany(mappedBy = "usersByOrderUserId", cascade = CascadeType.ALL)
    private List<Orders> ordersByUserId;
}
