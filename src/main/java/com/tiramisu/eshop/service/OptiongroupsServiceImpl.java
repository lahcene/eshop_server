package com.tiramisu.eshop.service;

import com.tiramisu.eshop.dao.OptionGroupsRepository;
import com.tiramisu.eshop.domain.OptionGroups;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by lahcen on 4/20/17.
 */
public class OptiongroupsServiceImpl implements InterfaceService<OptionGroups, Integer> {

    @Autowired
    OptionGroupsRepository optionGroupsRepository;


    @Override
    public OptionGroups find(Integer integer) {
        return null;
    }

    @Override
    public OptionGroups save(OptionGroups entity) {
        return null;
    }

    @Override
    public List<OptionGroups> save(Iterable<OptionGroups> entities) {
        return null;
    }

    @Override
    public boolean exists(Integer integer) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public void delete(OptionGroups entity) {

    }
}
