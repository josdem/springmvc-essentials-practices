package com.makingdevs.practica3;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.makingdevs.model.Project;
import com.makingdevs.repositories.ProjectRepository;
import com.makingdevs.services.ProjectService;

@Controller
public class ProjectController {
  
  @Autowired
  ProjectRepository projectRepository;
  
  @Autowired
  ProjectService projectService;

  @RequestMapping("/project")
  public String allProjects(Model model) {
    model.addAttribute("message", "Welcome to projects manager!");
    model.addAttribute("projects",projectRepository.findAll());
    return "project/list";
  }
  
  @RequestMapping(value="/newProject",method=RequestMethod.GET)
  public ModelAndView createNewProject() {
    Map<String,Object> model = new HashMap<String,Object>();
    Project project = new Project();
    model.put("project", project);
    return new ModelAndView("project/new", model);
  }
  
  @RequestMapping(value="/saveProject",method=RequestMethod.POST)
  public String saveProject(Project project) {
    projectService.createNewProject(project);
    return "redirect:/project";
  }
  
}
// You must add @ComponentScan(basePackages = { "com.makingdevs.practica2" })
// or <context:component-scan base-package="com.makingdevs.practica2"/>
// depending on your configuration