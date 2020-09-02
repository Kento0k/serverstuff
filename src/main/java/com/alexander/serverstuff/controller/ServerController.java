package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.entity.Server;
import com.alexander.serverstuff.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/server")
public class ServerController {
    @Autowired
    private ServerService serverService;

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Server getServer(@PathVariable Integer id){
        return serverService.getServer(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Server updateServer(@RequestBody Server server){
        return serverService.updateServer(server);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Boolean deleteServer(@PathVariable Integer id){
        return serverService.deleteServer(id);
    }
}
