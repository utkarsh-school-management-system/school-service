package xyz.utkarshgoyal.schoolservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.utkarshgoyal.schoolservice.entity.School;
import xyz.utkarshgoyal.schoolservice.entity.Student;
import xyz.utkarshgoyal.schoolservice.service.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/school")
public class SchoolController {

    @Autowired
    SchoolService schoolService;


    @PostMapping
    public School add(@RequestBody School school) {
        return schoolService.add(school);
    }

    @GetMapping
    public List<School> get() {
        return schoolService.get();
    }

    @GetMapping("/{id}")
    public School getAll(@PathVariable Long id) {
        return schoolService.get(id);
    }

    @GetMapping("/student/{schoolId}")
    public School getStudentsBySchoolId(@PathVariable Long schoolId) { return schoolService.getStudentsBySchoolId(schoolId); }

}
