package com.murithipaul.portfolio.service;

import com.murithipaul.portfolio.entity.Skill;
import com.murithipaul.portfolio.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class SkillServiceImpl implements SkillService {
    @Autowired
    private SkillRepository skillRepository;

    @Override
    public Skill addSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public List<Skill> getSkills() {
        return skillRepository.findAll();
    }

    @Override
    public Optional<Skill> getSkillById(UUID id) {
        return skillRepository.findById(id);
    }

    @Override
    public void deleteSkill(UUID id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skill updateSkill(UUID id, Skill skill) {
        Skill skillDB = skillRepository.findById(id).get();

//        validate fields
        if(Objects.nonNull(skill.getName()) && !"".equalsIgnoreCase(skill.getName())){
            skillDB.setName(skill.getName());
        }
        return skillRepository.save(skillDB);
    }

}
