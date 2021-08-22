package com.murithipaul.portfolio.controller;

import com.murithipaul.portfolio.entity.Project;
import com.murithipaul.portfolio.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getProjects(){
        return projectService.getProjects();
    }

    @GetMapping("{id}")
    public Optional<Project> getProjectById(@PathVariable("id") UUID id){
        return projectService.getProjectById(id);
    }

    @PostMapping
    public Project addProject(Project project){
        return projectService.addProject(project);
    }
}
