package com.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Rajesh on 25-08-2017.
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
          return "index";
      }



}