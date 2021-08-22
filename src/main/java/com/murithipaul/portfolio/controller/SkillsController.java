package com.murithipaul.portfolio.controller;

import com.murithipaul.portfolio.entity.Skill;
import com.murithipaul.portfolio.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/skills")
public class SkillsController {
    @Autowired
    private SkillService skillService;

//    get all skills
    @GetMapping
    public List<Skill> getSkills(){
        return skillService.getSkills();
    }

//    add a skill
    @PostMapping
    public Skill addSkill(@RequestBody Skill skill){
        return skillService.addSkill(skill);
    }

//    get a skill by id
    @GetMapping("/{id}")
    public Optional<Skill> getSkillById(@PathVariable("id") UUID id){
        return skillService.getSkillById(id);
    }

//    update a skill
    @PutMapping("/{id}")
    public Skill updateSkill(@PathVariable("id") UUID id, @RequestBody Skill skill){
        return skillService.updateSkill(id, skill);
    }

//    delete a skill
    @DeleteMapping("/{id}")
    public String deleteSkill(@PathVariable("id") UUID id){
        skillService.deleteSkill(id);
        return "Skill deleted successfully";
    }
}
