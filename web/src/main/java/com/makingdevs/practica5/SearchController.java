package com.makingdevs.practica5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/search/**")
public class SearchController {
  
  @RequestMapping(method=RequestMethod.GET)
  public String searchInProjects(){
    return null;
  }
  
  @RequestMapping(method=RequestMethod.POST)
  public String searchResults(){
    return null;
  }
}
