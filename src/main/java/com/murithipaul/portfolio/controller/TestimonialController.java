package com.murithipaul.portfolio.controller;

import com.murithipaul.portfolio.entity.Testimonial;
import com.murithipaul.portfolio.service.TestimonialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/testimonials")
public class TestimonialController {
    private TestimonialService testimonialService;

    @Autowired
    public TestimonialController(TestimonialService testimonialService) {
        this.testimonialService = testimonialService;
    }

    @GetMapping
    public List<Testimonial> getTestimonials(){
        return testimonialService.getTestimonials();
    }

    @GetMapping("/{id}")
    public Testimonial getTestimonialById(@PathVariable("id") long id){
        return testimonialService.getTestimonialById(id);
    }

    @PostMapping
    public  Testimonial addTestimonial(@RequestBody Testimonial testimonial){
        return testimonialService.addTestimonial(testimonial);
    }

    @PutMapping("/{id}")
    public Testimonial editTestimonial(@PathVariable("id") long id, @RequestBody Testimonial testimonial){
        return testimonialService.editTestimonial(id, testimonial);
    }

    @DeleteMapping("/{id}")
    public String deleteTestimonial(@PathVariable("id") long id){
        testimonialService.deleteTestimonial(id);
        return "Testimonial deleted successfully";
    }
}
