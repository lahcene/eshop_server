package com.tiramisu.eshop.service;

import com.tiramisu.eshop.dao.CustomerRepository;
import com.tiramisu.eshop.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lahcen on 4/20/17.
 */
@Service
public class CustomerServiceImpl extends AbstractService<Customer, Integer> implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository repository) {
        super(repository);
    }

    @Override
    public Customer find(Integer integer) {
        return super.find(integer);
    }

    @Override
    public Customer save(Customer entity) {
        return super.save(entity);
    }

    @Override
    public List<Customer> save(Iterable<Customer> entities) {
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
    public void delete(Customer entity) {
        super.delete(entity);
    }
}
