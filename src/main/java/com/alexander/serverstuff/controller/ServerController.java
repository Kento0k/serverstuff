package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.entity.Server;
import com.alexander.serverstuff.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/server")
public class ServerController {
    @Autowired
    private ServerService serverService;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Server getServer(@RequestBody Integer id){
        return serverService.getServer(id);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Server updateServer(@RequestBody Server server){
        return serverService.updateServer(server);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseBody
    public Boolean deleteServer(@RequestBody Integer id){
        return serverService.deleteServer(id);
    }
}
