package com.makingdevs.practica3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.makingdevs.services.UserStoryService;

@Controller
public class UserStoryController {

  @Autowired
  UserStoryService userStoryService;

  @RequestMapping("/project/{codeName}/userStories")
  public String allProjects(@PathVariable("codeName") String codeName, Model model) {
    
    return "userStory/project";
  }

}
// You must add @ComponentScan(basePackages = { "com.makingdevs.practica3" })
// or <context:component-scan base-package="com.makingdevs.practica3"/>
// depending on your configuration