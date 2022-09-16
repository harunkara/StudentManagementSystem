package com.studentmanagementsystem.controller;
import javax.validation.Valid;
import com.studentmanagementsystem.dto.StudentDto;
import com.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;
    @PostMapping
    public ResponseEntity<StudentDto> save(@Valid @RequestBody StudentDto studentDto){
        return ResponseEntity.ok(studentService.save(studentDto));
    }
}
