package com.murithipaul.portfolio.service;

import com.murithipaul.portfolio.entity.Testimonial;
import com.murithipaul.portfolio.repository.TestimonialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestimonialServiceImpl implements TestimonialService{

    @Autowired
    private TestimonialRepository testimonialRepository;

    @Override
    public List<Testimonial> getTestimonials() {
        return testimonialRepository.findAll();
    }

    @Override
    public Testimonial getTestimonialById(long id) {
        return testimonialRepository.getById(id);
    }

    @Override
    public Testimonial addTestimonial(Testimonial testimonial) {
        return testimonialRepository.save(testimonial);
    }

    @Override
    public Testimonial editTestimonial(long id, @NonNull Testimonial testimonial) {
        Testimonial testimonialDB = testimonialRepository.findById(id).get();
        testimonialDB.setName(testimonial.getName());
        testimonialDB.setCompany(testimonial.getCompany());
        testimonialDB.setMessage(testimonial.getMessage());
        return testimonialRepository.save(testimonialDB);
    }

    @Override
    public void deleteTestimonial(long id) {
        testimonialRepository.deleteById(id);
    }
}
