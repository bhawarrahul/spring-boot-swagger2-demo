package com.swagger2.controller;

import com.swagger2.Entity.Student;
import com.swagger2.repository.StudentRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Api(value="Student REST API System")
@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @ApiOperation(value = "get Student details by id ", response = Student.class)
    @GetMapping("/students/{id}")
    public Optional<Student> getStudent(@PathVariable int id) {
        return studentRepository.findById(id);
    }
    @ApiOperation(value = "Get All Student list ", response = List.class)
    @GetMapping("/students")
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
    @ApiOperation(value = "Save new Student ", response = Student.class)
    @PostMapping( "/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
    @ApiOperation(value = "delete Student by ID", response = String.class)
    @DeleteMapping(value = "/students/{studentId}")
    public String deleteStudent(@PathVariable int studentId) {
        studentRepository.deleteById(studentId);
        return "Deleted successfully!!";
    }
    @ApiOperation(value = "Search Student By Name or Email", response = List.class)
    @GetMapping("/students/search/{ss}")
    public List<Student> searchStudent(@PathVariable String ss) {
        return studentRepository.findByNameContainingOrEmailContaining(ss, ss);
    }

}
