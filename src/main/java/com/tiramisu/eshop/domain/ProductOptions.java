package com.tiramisu.eshop.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by lahcen on 4/5/17.
 */
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "productoptions")
public class ProductOptions {
    @Id
    @GeneratedValue
    @Column(name = "ProductOptionID")
    private int productOptionId;
    
    @Column(name = "OptionPriceIncrement")
    private Double optionPriceIncrement;
    
    @Column(name = "OptionGroupID")
    private int optionGroupId;

    @ManyToOne
    @JoinColumn(name = "ProductID", referencedColumnName = "ProductID", nullable = false)
    private Products productsByProductId;

    @ManyToOne
    @JoinColumn(name = "OptionID", referencedColumnName = "OptionID", nullable = false)
    private Options optionsByOptionId;
}
