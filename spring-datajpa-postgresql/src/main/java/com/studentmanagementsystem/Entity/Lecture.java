package com.studentmanagementsystem.Entity;

import lombok.*;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="lecture")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of= {"id"})
@ToString
public class Lecture implements Serializable {
    @Id
    @SequenceGenerator(name="seq_lecture_id",allocationSize = 1)
    @GeneratedValue(generator = "seq_lecture_id",strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length=100,nullable = false)
    private String name;
    @Column(nullable = false, name="ects")
    private int ects;
    @Column(name="active")
    private Boolean active;
    @Enumerated
    private LectureType lectureType;
    @ManyToMany
    @JoinColumn(name="student_lecture_id")
    private List<Student> students;
    public enum LectureType{
        REQUIRED,
        OPTIONAL,
        OTHER
    }
}
