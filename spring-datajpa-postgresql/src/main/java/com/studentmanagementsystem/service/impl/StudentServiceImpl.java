package com.studentmanagementsystem.service.impl;

import com.studentmanagementsystem.Entity.Lecture;
import com.studentmanagementsystem.Entity.Student;
import com.studentmanagementsystem.dto.LectureDto;
import com.studentmanagementsystem.dto.StudentDto;
import com.studentmanagementsystem.repo.LectureRepository;
import com.studentmanagementsystem.repo.StudentRepository;
import com.studentmanagementsystem.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;
    private final LectureRepository lectureRepository;
    @Override
    @Transactional
    public StudentDto save(StudentDto studentDto) {
        Student student=new Student();
        student.setName(studentDto.getName());
        student.setSurname(studentDto.getSurname());
        student.setStudentNumber(studentDto.getStudentNumber());
        student.setActive(studentDto.getActive());
        final Student studentDb = studentRepository.save(student);
        List<Student> studentList=new ArrayList<>();
        List<Lecture> list=new ArrayList<>();
        studentDto.getLectures().forEach(item->{
            Lecture lecture=new Lecture();
            lecture.setName(item);
            lecture.setLectureType(Lecture.LectureType.OTHER);
            lecture.setActive(true);
            studentList.add(studentDb);
            lecture.setStudents(studentList);
            list.add(lecture);
        });
        lectureRepository.saveAll(list);
        studentDto.setId(studentDb.getId());
        return studentDto;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public StudentDto get(Long id) {
        return null;
    }

    @Override
    public StudentDto getAll(StudentDto studentDto) {
        return null;
    }

    @Override
    public StudentDto update(StudentDto studentDto) {
        return null;
    }

    @Override
    public Page<StudentDto> getAll(Pageable pageable) {
        return null;
    }
}
