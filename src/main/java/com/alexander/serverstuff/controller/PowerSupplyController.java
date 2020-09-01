package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.service.PowerSupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/powerSupply")
public class PowerSupplyController {
    @Autowired
    private PowerSupplyService powerSupplyService;
}
