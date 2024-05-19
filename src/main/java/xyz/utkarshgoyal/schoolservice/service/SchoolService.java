package xyz.utkarshgoyal.schoolservice.service;

import xyz.utkarshgoyal.schoolservice.entity.School;
import xyz.utkarshgoyal.schoolservice.entity.Student;

import java.util.List;

public interface SchoolService {
    School add(School school);
    School get(Long id);
    List<School> get();
   School getStudentsBySchoolId(Long schoolId);
}
