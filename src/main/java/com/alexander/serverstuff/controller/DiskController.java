package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.entity.Disk;
import com.alexander.serverstuff.service.DiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/disk")
public class DiskController {
    @Autowired
    private DiskService diskService;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Disk getDisk(@PathVariable Integer id){
        return diskService.getDisk(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Disk updateDisk(@RequestBody Disk disk){
        return diskService.updateDisk(disk);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Boolean deleteDisk(@PathVariable Integer id){
        return diskService.deleteDisk(id);
    }
}
