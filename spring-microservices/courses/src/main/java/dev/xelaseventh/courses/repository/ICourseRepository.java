package dev.xelaseventh.courses.repository;

import dev.xelaseventh.courses.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface ICourseRepository extends CrudRepository<Course, Long> {

}
