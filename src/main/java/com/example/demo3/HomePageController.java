package com.example.demo3;

import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {

      @RequestMapping("/h")
      public String homePage() {
        return "home.html";
      }

  }