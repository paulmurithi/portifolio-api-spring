package com.murithipaul.portfolio.repository;

import com.murithipaul.portfolio.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project, UUID> {
}
