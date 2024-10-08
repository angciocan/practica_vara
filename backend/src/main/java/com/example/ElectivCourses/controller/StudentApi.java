package com.example.ElectivCourses.controller;

import com.example.ElectivCourses.converter.StudentConverter;
import com.example.ElectivCourses.model.dto.EnrollmentDTO;
import com.example.ElectivCourses.model.dto.StudentDTO;
import com.example.ElectivCourses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "http://localhost:4200")
public class StudentApi {

    @Autowired
    private StudentService studentService;

    @GetMapping("/")
    @ResponseBody
    public List<StudentDTO> getAllStudents() {
        return  studentService.getAllStudents();
    }

    @GetMapping("/getStudentEnrollments/{studentId}")
    public ArrayList<EnrollmentDTO> getAllStudentEnrollments(@PathVariable("studentId") Long studentId) {
        return studentService.getStudentEnrollmentDTOs(studentId);
    }

    @PatchMapping("/updateStudent/reorderPriorityList/{studentId}/{courseId}/{nrInList}")
    public void updateStudentPreferenceList(@PathVariable("studentId") Long studentId, @PathVariable("courseId") Long courseId, @PathVariable("nrInList") int nrInList) {
        studentService.updateStudentPreferenceList(studentId, courseId, nrInList);
    }

    @GetMapping("/getStudent/{studentId}")
    public StudentDTO getStudent(@PathVariable("studentId") Long studentId) {
        return StudentConverter.toDTO(studentService.getStudentById(studentId));
    }
}
