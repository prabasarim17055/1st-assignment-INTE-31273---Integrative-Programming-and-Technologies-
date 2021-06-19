package com.example.student.api;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStudentRepository implements StudentRepository {

    Map<String,Student> database = new HashMap<>();

    @Override
    public void save(Student student) {
        database.put(student.id, student);
        System.out.println("Student saved in the database");
    }

    @Override
    public Student get(String id) {
        return database.get(id);}

    @Override
    public Student delete(String id) {
        return database.remove(id);}

    @Override
    public void update(Student student) {
        database.put(student.id, student);}
}
