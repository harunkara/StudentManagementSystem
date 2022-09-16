package com.studentmanagementsystem.repo;

import com.studentmanagementsystem.Entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture,Long> {
}
