package com.Student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.Student.Model.Student;
import com.Student.Service.StudentService;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/add")
    public String addStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "addStudent";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") Long id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "updateStudent";
    }

    @PostMapping("/update/{id}")
    public String updateStudentById(@PathVariable("id") Long id, @ModelAttribute("student") Student student) {
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setName(student.getName());
       existingStudent.setGender(student.getGender());
        existingStudent.setDepartment(student.getDepartment());
        studentService.saveStudent(existingStudent);
        return "redirect:/";
    }
//    
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/";
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Student> studentList = studentService.getAllStudents();
        model.addAttribute("studentList", studentList);
        return "homePage";
    }
}
