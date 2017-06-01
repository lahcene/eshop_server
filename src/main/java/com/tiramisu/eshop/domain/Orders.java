package com.tiramisu.eshop.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by lahcen on 4/5/17.
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue
    @Column(name = "OrderID")
    private int orderId;
    
    @Column(name = "OrderAmount")
    private double orderAmount;

    @Column(name = "OrderCity")
    private String orderCity;
    
    @Column(name = "OrderCountry")
    private String orderCountry;
    
    @Column(name = "OrderDate")
    private LocalDateTime orderDate;
    
    @Column(name = "OrderEmail")
    private String orderEmail;
    
    @Column(name = "OrderFax")
    private String orderFax;
    
    @Column(name = "OrderPhone")
    private String orderPhone;
    
    @Column(name = "OrderShipAddress")
    private String orderShipAddress;
    
    @Column(name = "OrderShipAddress2")
    private String orderShipAddress2;
    
    @Column(name = "OrderShipName")
    private String orderShipName;
    
    @Column(name = "OrderShipped")
    private boolean orderShipped;
    
    @Column(name = "OrderShipping")
    private double orderShipping;
    
    @Column(name = "OrderState")
    private String orderState;
    
    @Column(name = "OrderTax")
    private double orderTax;
    
    @Column(name = "OrderTrackingNumber")
    private String orderTrackingNumber;
    
    @Column(name = "OrderZip")
    private String orderZip;

    @OneToMany(mappedBy = "ordersByDetailOrderId")
    private List<OrderDetails> orderDetailsByOrderId;

    @ManyToOne
    @JoinColumn(name = "OrderUserID", referencedColumnName = "UserID", nullable = false)
    private Users usersByOrderUserId;
}
