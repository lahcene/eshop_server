package com.tiramisu.eshop.service;

import com.tiramisu.eshop.dao.OrdersRepository;
import com.tiramisu.eshop.domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lahcen on 4/20/17.
 */
public class OrdersServiceImpl extends AbstractService<Orders, Integer> implements OrdersService {

    @Autowired
    OrdersRepository ordersRepository;


    public OrdersServiceImpl(OrdersRepository repository) {
        super(repository);
    }

    @Override
    public Orders find(Integer integer) {
        return super.find(integer);
    }

    @Override
    public Orders save(Orders entity) {
        return super.save(entity);
    }

    @Override
    public List<Orders> save(Iterable<Orders> entities) {
        return super.save(entities);
    }

    @Override
    public boolean exists(Integer integer) {
        return super.exists(integer);
    }

    @Override
    public long count() {
        return super.count();
    }

    @Override
    public void delete(Integer integer) {
        super.delete(integer);
    }

    @Override
    public void delete(Orders entity) {
        super.delete(entity);
    }
}
