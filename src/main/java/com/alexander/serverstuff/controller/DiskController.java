package com.alexander.serverstuff.controller;

import com.alexander.serverstuff.service.DiskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/disk")
public class DiskController {
    @Autowired
    private DiskService diskService;
}
