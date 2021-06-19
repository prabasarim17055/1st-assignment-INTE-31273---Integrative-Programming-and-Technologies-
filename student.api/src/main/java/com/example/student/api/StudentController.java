package com.example.student.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository();
    //REST ENDPOINTS
    //create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student)
    { repository.save(student);}

    //retrieve a student
    @GetMapping("/student/:{id}")
    public Student getStudent(@PathVariable String id)
    {return repository.get(id);}

    //delete a student
    @GetMapping("/student/:{id}")
    public Student deleteStudent(@PathVariable String id)
    {return repository.delete(id);}

    //update a student
    public void updateStudent(@RequestBody Student student)
    { repository.update(student);}
}
