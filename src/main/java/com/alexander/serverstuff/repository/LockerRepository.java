package com.alexander.serverstuff.repository;

import com.alexander.serverstuff.entity.Locker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LockerRepository extends CrudRepository<Locker, Integer> {

}
