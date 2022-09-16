package com.studentmanagementsystem.service;

import com.studentmanagementsystem.Entity.Student;
import com.studentmanagementsystem.dto.StudentDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface StudentService {
    StudentDto save(StudentDto studentDto);
    void delete(Long id);
    StudentDto get(Long id);
    StudentDto getAll(StudentDto studentDto);
    StudentDto update(StudentDto studentDto);
    Page<StudentDto> getAll(Pageable pageable);
}
