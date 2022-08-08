package com.example.student.Controller;

import com.example.student.Model.Student;
import com.example.student.Repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RestController

public class StudentController {
    private StudentRepository studentRepo ;

    @GetMapping("/student")
    public List<Students> findAll(){
        return studentRepo.findAll() ;
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudents(@PathVariable Long id){
        return studentRepo.deleteById(id);
    }

    @PostMapping("/students")
    public Students addStudent(Students student){
        return studentRepo.add(student);
    }


}

