package com.tiramisu.eshop.dao;

import com.tiramisu.eshop.domain.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by lahcen on 4/4/17.
 */
@Repository
public interface OptionsReopository extends JpaRepository<Options, Integer> {
}
