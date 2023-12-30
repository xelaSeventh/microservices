package dev.xelaseventh.courses.service;

import dev.xelaseventh.courses.client.StudentClient;
import dev.xelaseventh.courses.dto.StudentDto;
import dev.xelaseventh.courses.entity.Course;
import dev.xelaseventh.courses.http.response.StudentByCourseResponse;
import dev.xelaseventh.courses.repository.ICourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements ICourseService{

    @Autowired
    private ICourseRepository courseRepository;

    @Autowired
    private StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentsByIdCourse(Long idCourse) {

        // Consultar el curso
        Course course = courseRepository.findById(idCourse).orElse(new Course());
        // Obtener Estudiantes
        List<StudentDto> studentDtoList = studentClient.findAllStudentByCourse(idCourse);

        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .courseTeacher(course.getTeacher())
                .studentDtoList(studentDtoList)
                .build();
    }
}
