package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.entity.PowerSupplier;
import com.alexander.serverstuff.service.PowerSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/powerSupply")
public class PowerSupplyController {
    @Autowired
    private PowerSupplyService powerSupplyService;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public PowerSupplier getPowerSupplier(@PathVariable Integer id){
        return powerSupplyService.getPowerSupply(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public PowerSupplier updatePowerSupplier(@RequestBody PowerSupplier powerSupplier){
        return powerSupplyService.updatePowerSupply(powerSupplier);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Boolean deletePowerSupplier(@PathVariable Integer id){
        return powerSupplyService.deletePowerSupply(id);
    }
}
