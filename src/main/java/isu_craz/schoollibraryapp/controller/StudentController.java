package isu_craz.schoollibraryapp.controller;

import isu_craz.schoollibraryapp.model.Student;
import isu_craz.schoollibraryapp.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentRepository studentRepository;
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }
}