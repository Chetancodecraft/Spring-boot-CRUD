package com.spring.data.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.data.Entity.Student;

public interface StuRepo extends JpaRepository<Student, Long> {
}
