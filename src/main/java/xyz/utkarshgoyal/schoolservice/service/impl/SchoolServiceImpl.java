package xyz.utkarshgoyal.schoolservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.utkarshgoyal.schoolservice.entity.School;
import xyz.utkarshgoyal.schoolservice.entity.Student;
import xyz.utkarshgoyal.schoolservice.repository.SchoolRepo;
import xyz.utkarshgoyal.schoolservice.service.SchoolService;
import xyz.utkarshgoyal.schoolservice.service.StudentClient;

import java.util.List;

@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    SchoolRepo schoolRepo;

    @Autowired
    StudentClient studentClient;

    @Override
    public School add(School school) {
        return schoolRepo.save(school);
    }

    @Override
    public School get(Long id) {
        return schoolRepo.findById(id).orElseThrow(() -> new RuntimeException("School not found"));
    }

    @Override
    public List<School> get() {
        return schoolRepo.findAll();
    }

    @Override
    public School getStudentsBySchoolId(Long schoolId) {
        School school = null;
        try {
            school = this.get(schoolId);
        } catch(RuntimeException e) {
            throw new RuntimeException("School not found");
        }

        school.setStudents(studentClient.getStudentsBySchoolId(schoolId));
        return school;
    }
}
