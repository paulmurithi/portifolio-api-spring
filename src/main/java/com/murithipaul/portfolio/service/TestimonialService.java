package com.murithipaul.portfolio.service;

import com.murithipaul.portfolio.entity.Testimonial;

import java.util.List;

public interface TestimonialService {
    public List<Testimonial> getTestimonials();

    public Testimonial getTestimonialById(long id);

    public Testimonial addTestimonial(Testimonial testimonial);

    public Testimonial editTestimonial(long id, Testimonial testimonial);

    public void deleteTestimonial(long id);
}
