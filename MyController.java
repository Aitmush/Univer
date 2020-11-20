package com.company.srs.controllers;

import com.company.srs.lessons.Lecture;
import com.company.srs.repositories.LectureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @Autowired
    private LectureRepository lectureRepository;

    @GetMapping("/srs")
    public String srsMain(Model model) {
        Iterable<Lecture> lectures = lectureRepository.findAll();
        model.addAttribute("lectures ", lectures);
        return "srs-main";
    }
}
