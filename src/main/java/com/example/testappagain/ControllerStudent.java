package com.example.testappagain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class ControllerStudent
{
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/")
    public String showThePage()
    {
        return "webPage";
    }

    /**I have to find a way to connect the buttons save and list differently*/



    @PostMapping("/save")
    public String  saveStudent( Student student)
    {
        studentRepository.save(student);
        return "webPage.html";
    }

    @PostMapping("/list")
    public String showTheList(@ModelAttribute Student student,  Model model)
    {
        model.addAttribute("students", studentRepository.findAll());

        return "studentsList";
    }



}
