package dev.xelaseventh.courses.service;

import dev.xelaseventh.courses.entity.Course;
import dev.xelaseventh.courses.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}
