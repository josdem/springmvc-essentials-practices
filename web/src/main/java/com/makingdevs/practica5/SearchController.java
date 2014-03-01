package com.makingdevs.practica5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.makingdevs.model.Project;
import com.makingdevs.model.Task;
import com.makingdevs.repositories.ProjectRepository;
import com.makingdevs.repositories.TaskRepository;

@Controller
@RequestMapping(value = "/search/**")
public class SearchController {
  
  @Autowired
  ProjectRepository projectRepository;
  
  @Autowired
  TaskRepository taskRepository;

  @RequestMapping(method = RequestMethod.GET)
  public void searchInProjects() {

  }

  @RequestMapping(method = RequestMethod.POST)
  public Map<String,Object> searchResults(@RequestParam("codeName") String codeName,
      @RequestParam("taskDescription") String taskDescription) {
    Map<String,Object> model = new HashMap<String,Object>();
    Project project = projectRepository.findByCodeName(codeName);
    List<Task> tasks = taskRepository.findAllByDescriptionLike(taskDescription);
    model.put("codeName",codeName);
    model.put("taskDescription",taskDescription);
    model.put("project", project);
    model.put("tasks", tasks);
    return model;
  }
}
