package com.azem.user.controler;

import com.azem.user.VO.ResponseTemplateVO;
import com.azem.user.entity.Child;
import com.azem.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserControler {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public Child saveUser(@RequestBody Child child) {
        log.info("hahaha UserControler saveUser");
        return userService.saveUser(child);
    }

    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithCourse(@PathVariable("id") Long id) {
        log.info("hahaha UserControler getUserWithCourse");
        return userService.getUserWithCourse(id);
    }
}
