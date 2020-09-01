package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.entity.Locker;
import com.alexander.serverstuff.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/locker")
public class LockerController {
    @Autowired
    private LockerService lockerService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Locker getLocker(@RequestBody Integer id){
        return lockerService.getLocker(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Locker updateLocker(@RequestBody Locker locker){
        return lockerService.updateLocker(locker);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public Boolean deleteLocker(@RequestBody Integer id){
        return lockerService.deleteLocker(id);
    }
}
