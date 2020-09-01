package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.entity.Disk;
import com.alexander.serverstuff.service.DiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/disk")
public class DiskController {
    @Autowired
    private DiskService diskService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Disk getDisk(@RequestBody Integer id){
        return diskService.getDisk(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Disk updateDisk(@RequestBody Disk disk){
        return diskService.updateDisk(disk);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public Boolean deleteDisk(@RequestBody Integer id){
        return diskService.deleteDisk(id);
    }
}
