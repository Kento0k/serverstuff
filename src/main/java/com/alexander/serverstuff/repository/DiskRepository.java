package com.alexander.serverstuff.repository;

import com.alexander.serverstuff.entity.Disk;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiskRepository extends CrudRepository<Disk, Integer> {
}
