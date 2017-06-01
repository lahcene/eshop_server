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
@Table(name = "subproductcategories")
public class SubProductCategories {
    @Id
    @GeneratedValue
    @Column(name = "SubCategoryID")
    private int subCategoryId;

    @Column(name = "SubCategoryName")
    private String subCategoryName;

    @ManyToOne
    @JoinColumn(name = "CategoryID", referencedColumnName = "CategoryID", nullable = false)
    private ProductCategories productCategoriesByCategoryId;
}
