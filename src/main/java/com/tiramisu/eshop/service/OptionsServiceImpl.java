package com.tiramisu.eshop.service;

import com.tiramisu.eshop.dao.OptionsReopository;
import com.tiramisu.eshop.domain.Options;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lahcen on 4/20/17.
 */
@Service
public class OptionsServiceImpl extends AbstractService<Options, Integer> implements OptionsService {

    @Autowired
    OptionsReopository optionsReopository;

    public OptionsServiceImpl(OptionsReopository reopository) {
        super(reopository);
    }

    @Override
    public Options find(Integer integer) {
        return super.find(integer);
    }

    @Override
    public Options save(Options entity) {
        return super.save(entity);
    }

    @Override
    public List<Options> save(Iterable<Options> entities) {
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
    public void delete(Options entity) {
        super.delete(entity);
    }
}
