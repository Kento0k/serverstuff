package com.alexander.serverstuff.service;

import com.alexander.serverstuff.entity.Locker;
import com.alexander.serverstuff.repository.LockerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LockerService {
    @Autowired
    LockerRepository lockerRepository;

    public Locker getLocker(Integer id){
        if(lockerRepository.findById(id).isPresent()) return lockerRepository.findById(id).get();
        else return null;
    }

    @Transactional
    public Locker updateLocker(Locker locker){
        if(lockerRepository.existsById(locker.getId())){
            lockerRepository.deleteById(locker.getId());
        }
        lockerRepository.save(locker);
        return lockerRepository.findById(locker.getId()).get();
    }

    @Transactional
    public Boolean deleteLocker(Integer id){
        if(lockerRepository.existsById(id)){
            lockerRepository.deleteById(id);
            return true;
        } else return false;
    }
}
