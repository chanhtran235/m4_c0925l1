package org.example.demo_spring_data_jpa.controller;

import org.example.demo_spring_data_jpa.entity.Student;
import org.example.demo_spring_data_jpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;


//    @GetMapping("")
//    public String showList(@PageableDefault(page = 0,size = 2,sort = "name",direction = Sort.Direction.DESC) Pageable pageable,
//                         @RequestParam(name = "searchName", required = false,defaultValue = "")String searchName,
//                         ModelMap model){
//        Page<Student> studentPage =  studentService.search(searchName,pageable);
//        model.addAttribute("studentPage", studentPage);
//        model.addAttribute("searchName", searchName);
//        return "student/list";
//    }

    @GetMapping("")
    public String showList(@RequestParam(name = "page",required = false,defaultValue = "0")int page,
                           @RequestParam(name = "searchName", required = false,defaultValue = "")String searchName,
                           ModelMap model){

        Sort sort = Sort.by("name").descending().and(Sort.by("gender").ascending());
        Pageable pageable = PageRequest.of(page,2,sort);
        Page<Student> studentPage =  studentService.search(searchName,pageable);
        model.addAttribute("studentPage", studentPage);
        model.addAttribute("searchName", searchName);
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
              studentService.add(student);
              redirectAttributes.addFlashAttribute("mess","is add success");
        return "redirect:/student";
    }

    @GetMapping("/detail")
    public String detail1(@RequestParam(name = "id")int id,
                          Model model){
        model.addAttribute("student",studentService.findById(id));
        return "student/detail";
    }

    @GetMapping("/detail/{id}")
    public String detail2(@PathVariable(name = "id")int id,
                          Model model){
        model.addAttribute("student",studentService.findById(id));
        return "student/detail";
    }
}
