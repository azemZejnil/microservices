package com.azem.course.service;

import com.azem.course.entity.Course;
import com.azem.course.repository.CourseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        log.info("hahaha CourseService saveCourse");
        return courseRepository.save(course);
    }

    public Course findCourseById(Long courseId) {
        return courseRepository.findByCourseId(courseId);
    }
}
