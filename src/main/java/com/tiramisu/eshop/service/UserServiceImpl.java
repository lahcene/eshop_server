package com.tiramisu.eshop.service;

import com.tiramisu.eshop.dao.UserRepository;
import com.tiramisu.eshop.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lahcen on 4/4/17.
 */
@Service
public class UserServiceImpl extends AbstractService<Users, Integer> implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public Users find(Integer integer) {
        return super.find(integer);
    }

    @Override
    public Users save(Users entity) {
        return super.save(entity);
    }

    @Override
    public List<Users> save(Iterable<Users> entities) {
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
    public void delete(Users entity) {
        super.delete(entity);
    }

    @Override
    public void test() {
        System.out.println(userRepository.findOne(1).getUserId());
    }
}
