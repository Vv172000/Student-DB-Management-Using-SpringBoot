package com.Student.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.Model.Student;
import com.Student.Repository.StudentRepo;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepository;

    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

   
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }
    
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
