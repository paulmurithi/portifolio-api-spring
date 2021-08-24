package com.murithipaul.portfolio.service;

import com.murithipaul.portfolio.entity.Testimonial;

import java.util.List;
import java.util.Optional;

public interface TestimonialService {
    public List<Testimonial> getTestimonials();

    public Optional<Testimonial> getTestimonialById(long id);

    public Testimonial addTestimonial(Testimonial testimonial);

    public Testimonial editTestimonial(long id, Testimonial testimonial);

    public void deleteTestimonial(long id);
}
