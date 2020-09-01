package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/server")
public class ServerController {
    @Autowired
    private ServerService serverService;
}
