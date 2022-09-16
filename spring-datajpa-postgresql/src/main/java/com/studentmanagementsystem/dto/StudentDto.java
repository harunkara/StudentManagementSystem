package com.studentmanagementsystem.dto;

import com.studentmanagementsystem.Entity.Lecture;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
@Data
public class StudentDto {
    private Long id;
    private String studentNumber;
    private String name;
    private String surname;
    private Boolean active;
    private List<String> lectures;
}
