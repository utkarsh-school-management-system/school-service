package xyz.utkarshgoyal.schoolservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import xyz.utkarshgoyal.schoolservice.entity.Student;

import java.util.List;

@FeignClient(url = "http://localhost:8082", value = "Student-Client")
public interface StudentClient {

    @GetMapping("/student/school/{schoolId}")
    List<Student> getStudentsBySchoolId(@PathVariable Long schoolId);
}
