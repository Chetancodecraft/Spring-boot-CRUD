package com.spring.data.Service;

import java.util.List;
import com.spring.data.Entity.Student;

public interface StudService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Long id, Student student);
    String deleteStudent(Long id);
}
