package org.example.demo1.controller;

import org.example.demo1.entity.Student;
import org.example.demo1.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService1;

    @ModelAttribute("subjects")
    public String[] getSubject(){
        return new String[]{"SQL","JAVA","PHP"};
    }

//    @RequestMapping(value = "/student", method = RequestMethod.HEAD)
    @GetMapping("")
    public String home(ModelMap model){
        List<Student> studentList =  studentService1.findAll();
        model.addAttribute("studentList", studentList);
        return "student/list";
    }
    @GetMapping("/add")
    public String showFormAdd(Model model){
        model.addAttribute("student", new Student());
        return "student/add";
    }

    @PostMapping("/add")
    public  String save(@ModelAttribute Student student,
                        RedirectAttributes redirectAttributes){
              studentService1.add(student);
              redirectAttributes.addFlashAttribute("mess","is add success");
        return "redirect:/student";
    }

    @GetMapping("/detail")
    public String detail1(@RequestParam(name = "id")int id){
        // xuống service lấy dl
        return "student/detail";
    }

    @GetMapping("/detail/{id}")
    public String detail2(@PathVariable(name = "id")int id){
        // xuống service lấy dl
        System.out.println("=======================================");
        System.out.println(id);
        return "student/detail";
    }
}
