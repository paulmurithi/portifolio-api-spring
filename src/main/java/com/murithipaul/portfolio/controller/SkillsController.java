package com.murithipaul.portfolio.controller;

import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("api/v1/skills")
public class SkillsController {

//    get all skills
    @GetMapping
    public String getSkills(){
        return "Yay! It is working";
    }

//    add a skill
    @PostMapping
    public String addSkill(){
        return "It is working";
    }

//    get a skill by id
    @GetMapping({id})
    public String getSkillById(@PathVariable("id") UUID id){
        return "It is working";
    }

//    update a skill
    @PutMapping({id})
    public String updateSkill(@PathVariable("id") UUID id, @RequestBody skill){
        return "It is working";
    }

//    delete a skill
    @DeleteMapping({id})
    public String deleteSkill(@PathVariable("id") UUID id){
        return "It is working";
    }
}
