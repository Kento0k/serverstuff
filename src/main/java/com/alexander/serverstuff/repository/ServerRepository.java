package com.alexander.serverstuff.repository;

import com.alexander.serverstuff.entity.Server;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepository extends CrudRepository<Server, Integer> {

}
