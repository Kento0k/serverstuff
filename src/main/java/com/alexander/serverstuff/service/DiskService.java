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
        if(diskRepository.existsById(disk.getId())){
            diskRepository.deleteById(disk.getId());
        }
        diskRepository.save(disk);
        return diskRepository.findById(disk.getId()).get();
    }

    @Transactional
    public Boolean deleteDisk(Integer id){
        if(diskRepository.existsById(id)){
            diskRepository.deleteById(id);
            return true;
        } else return false;
    }
}
