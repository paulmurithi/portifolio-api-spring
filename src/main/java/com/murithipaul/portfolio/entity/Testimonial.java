package com.murithipaul.portfolio.entity;

import javax.persistence.*;

@Entity
public class Testimonial {
    @Id
    @SequenceGenerator(
            name="testimonial_sequence",
            sequenceName = "testimonial_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "testimonial_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private long id;
    private String name;
    private String company;
    private String message;

    public Testimonial() {
    }

    public Testimonial(String name, String company, String message) {
        this.name = name;
        this.company = company;
        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Testimonial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
