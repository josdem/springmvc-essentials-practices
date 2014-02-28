package com.makingdevs.practica2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {

  @RequestMapping("/project")
  public String allProjects(Model model) {
    model.addAttribute("message", "Welcome to projects manager!");
    return "project/list";
  }
}
// You must add @ComponentScan(basePackages = { "com.makingdevs.practica2" })
// or <context:component-scan base-package="com.makingdevs.practica2"/>
// depending on your configuration