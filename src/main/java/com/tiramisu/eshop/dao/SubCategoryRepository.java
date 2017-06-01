package com.tiramisu.eshop.dao;

import com.tiramisu.eshop.domain.SubProductCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lahcen on 4/4/17.
 */
@Repository
public interface SubCategoryRepository extends JpaRepository<SubProductCategories, Integer> {
}
