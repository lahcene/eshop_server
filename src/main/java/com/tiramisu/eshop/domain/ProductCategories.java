package com.tiramisu.eshop.domain;

import lombok.*;

import javax.persistence.*;
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
@Table(name = "productcategories")
public class ProductCategories {
    @Id
    @GeneratedValue
    @Column(name = "CategoryID")
    private int categoryId;
    
    @Column(name = "CategoryName")
    private String categoryName;
    
    @Column(name = "CategoryGender")
    private String categoryGender;

    @OneToMany(mappedBy = "productCategoriesByProductCategoryId", cascade = CascadeType.ALL)
    private List<Products> productsByCategoryId;

    @OneToMany(mappedBy = "productCategoriesByCategoryId", cascade = CascadeType.ALL)
    private List<SubProductCategories> subProductCategoriesByCategoryId;
}
