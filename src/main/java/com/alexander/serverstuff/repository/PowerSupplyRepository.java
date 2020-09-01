package com.alexander.serverstuff.repository;

import com.alexander.serverstuff.entity.PowerSupplier;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyRepository extends CrudRepository<PowerSupplier, Integer> {

}
