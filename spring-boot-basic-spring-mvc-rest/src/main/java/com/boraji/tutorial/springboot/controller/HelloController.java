package com.boraji.tutorial.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

   @RequestMapping("/")
   public String index() {
      return "index";
   }

   
   @GetMapping("/Mymvcexample")
   public String index2() {
      return "HIIIIIII";
   }
   
   
   @PostMapping("/hello")
   public String sayHello(@RequestParam("name") String name, Model model) {
      model.addAttribute("name", name);
      return "index2";
   }
}
