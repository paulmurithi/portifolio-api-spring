package com.murithipaul.portfolio.service;

import com.murithipaul.portfolio.entity.Project;
import com.murithipaul.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ProjectServiceImpl implements ProjectService{
    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<Project> getProjects() {
        return projectRepository.findAll();
    }

    @Override
    public Optional<Project> getProjectById(UUID id) {
        return projectRepository.findById(id);
    }

    @Override
    public Project addProject(Project project) {
        return projectRepository.save(project);
    }
}
