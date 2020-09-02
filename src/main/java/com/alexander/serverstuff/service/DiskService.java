package com.alexander.serverstuff.service;

import com.alexander.serverstuff.entity.Disk;
import com.alexander.serverstuff.repository.DiskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class DiskService {
    @Autowired
    DiskRepository diskRepository;

    public Disk getDisk(Integer id){
        if(diskRepository.findById(id).isPresent()) return diskRepository.findById(id).get();
        else return null;
    }

    @Transactional
    public Disk updateDisk(Disk disk){
        return diskRepository.save(disk);
    }

    @Transactional
    public Boolean deleteDisk(Integer id){
        if(diskRepository.existsById(id)){
            diskRepository.deleteById(id);
            return true;
        } else return false;
    }
}
