package com.murithipaul.portfolio.service;

import com.murithipaul.portfolio.entity.Project;
import com.murithipaul.portfolio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProjectServiceImpl implements ProjectService{
    private ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

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

    @Override
    public Project updateProject(UUID id, Project project) {
        Project projectDB = projectRepository.findById(id).get();
        if(Objects.nonNull(project) && !"".equalsIgnoreCase(project.getName())){
            projectDB.setName(project.getName());
        }
        return projectRepository.save(projectDB);
    }

    @Override
    public void deleteProject(UUID id) {
        projectRepository.deleteById(id);
    }
}
