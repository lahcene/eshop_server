package com.tiramisu.eshop.dao;

import com.tiramisu.eshop.domain.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lahcen on 4/4/17.
 */
@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
