package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.entity.Locker;
import com.alexander.serverstuff.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/locker")
public class LockerController {
    @Autowired
    private LockerService lockerService;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Locker getLocker(@PathVariable Integer id){
        return lockerService.getLocker(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Locker updateLocker(@RequestBody Locker locker){
        return lockerService.updateLocker(locker);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Boolean deleteLocker(@PathVariable Integer id){
        return lockerService.deleteLocker(id);
    }
}
