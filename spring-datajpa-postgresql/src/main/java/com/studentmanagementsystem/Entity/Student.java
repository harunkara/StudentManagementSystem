package com.studentmanagementsystem.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="student")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of= {"id"})
@ToString
public class Student {
    @Id
    @SequenceGenerator(name="seq_student_id",allocationSize = 1)
    @GeneratedValue(generator = "seq_student_id",strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name="student_number", nullable = false)
    private String studentNumber;
    @Column(length=50,nullable = false)
    private String name;
    @Column(length=50,nullable = false)
    private String surname;
    @Column(name="active")
    private Boolean active;
    @OneToMany
    @JoinColumn(name="student_lecture_id")
    private List<Lecture> lectures;
}
