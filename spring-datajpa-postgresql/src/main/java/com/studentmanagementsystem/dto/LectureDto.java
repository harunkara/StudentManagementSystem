package com.studentmanagementsystem.dto;

import com.studentmanagementsystem.Entity.Lecture;
import com.studentmanagementsystem.Entity.Student;

import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import java.util.List;

public class LectureDto {
    private Long id;
    private String name;
    private int ects;
    private List<String> students;
}
