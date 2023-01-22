package com.azem.user.service;

import com.azem.user.VO.Course;
import com.azem.user.VO.ResponseTemplateVO;
import com.azem.user.entity.Child;
import com.azem.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Child saveUser(Child child) {
        log.info("hahaha UserService saveUser");
        return userRepository.save(child);
    }

    public ResponseTemplateVO getUserWithCourse(Long userId) {
        log.info("hahaha UserService getUserWithCourse");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Child child = userRepository.findByUserId(userId);

        Course course = restTemplate.getForObject("http://COURSE-SERVICE/courses/" + child.getCourseId(), Course.class);

        vo.setChild(child);
        vo.setCourse(course);
        return vo;
    }
}
