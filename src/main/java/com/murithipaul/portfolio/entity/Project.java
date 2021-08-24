package com.murithipaul.portfolio.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Project {
    @Id
    @SequenceGenerator(
            name = "project_sequence",
            sequenceName = "project_sequence",
            allocationSize = 50
    )
    @GeneratedValue(
            generator = "project_sequence",
            strategy = GenerationType.AUTO)
    private UUID id;

    @Column(
            unique = true,
            nullable = false
    )
    private String name;

    private String link;

    public Project() {

    }

    public Project(String name, String link) {
        this.name = name;
        this.link = link;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
