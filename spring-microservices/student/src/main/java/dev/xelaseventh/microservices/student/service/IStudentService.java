package dev.xelaseventh.microservices.student.service;

import dev.xelaseventh.microservices.student.entity.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findByIdCourse(Long idCourse);
}
