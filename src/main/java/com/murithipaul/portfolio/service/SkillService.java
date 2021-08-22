package com.murithipaul.portfolio.service;

import com.murithipaul.portfolio.entity.Skill;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SkillService {
    public Skill addSkill(Skill skill);

    public List<Skill> getSkills();

    public Optional<Skill> getSkillById(UUID id);

    public void deleteSkill(UUID id);

    public Skill updateSkill(UUID id, Skill skill);
}
