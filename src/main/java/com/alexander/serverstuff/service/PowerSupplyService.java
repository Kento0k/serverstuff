package com.alexander.serverstuff.service;

import com.alexander.serverstuff.entity.PowerSupplier;
import com.alexander.serverstuff.repository.PowerSupplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PowerSupplyService {
    @Autowired
    PowerSupplyRepository powerSupplyRepository;

    public PowerSupplier getPowerSupply(Integer id){
        if(powerSupplyRepository.findById(id).isPresent()) return powerSupplyRepository.findById(id).get();
        else return null;
    }

    @Transactional
    public PowerSupplier updatePowerSupply(PowerSupplier powerSupplier){
        return powerSupplyRepository.save(powerSupplier);
    }

    @Transactional
    public Boolean deletePowerSupply(Integer id){
        if(powerSupplyRepository.existsById(id)){
            powerSupplyRepository.deleteById(id);
            return true;
        } else return false;
    }
}
