package dev.xelaseventh.courses.http.response;

import dev.xelaseventh.courses.dto.StudentDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentByCourseResponse {

    private String courseName;
    private String courseTeacher;
    private List<StudentDto> studentDtoList;

}
