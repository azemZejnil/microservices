package com.azem.course.controller;

import com.azem.course.entity.Course;
import com.azem.course.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
@Slf4j
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping("/")
    public Course saveCourse(@RequestBody Course course) {
        log.info("hahaha CourseController saveCourse");
        return courseService.saveCourse(course);
    }

    @GetMapping("/{id}")
    public Course findCourseById(@PathVariable("id") Long id) {
        log.info("hahaha CourseController findCourseById");
        return courseService.findCourseById(id);
    }
}
