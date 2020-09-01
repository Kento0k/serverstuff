package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.service.LockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/locker")
public class LockerController {
    @Autowired
    private LockerService lockerService;
}
