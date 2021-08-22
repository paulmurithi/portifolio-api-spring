package com.murithipaul.portfolio.service;

import com.murithipaul.portfolio.entity.Project;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProjectService {
    public List<Project> getProjects();

    public Optional<Project> getProjectById(UUID id);

    public Project addProject(Project project);
}
