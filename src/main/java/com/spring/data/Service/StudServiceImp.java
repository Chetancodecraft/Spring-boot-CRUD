package com.spring.data.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.data.Entity.Student;
import com.spring.data.Repository.StuRepo;

@Service
public class StudServiceImp implements StudService {

    @Autowired
    private StuRepo studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {
        Optional<Student> existingStudent = studentRepository.findById(id);
        if (existingStudent.isPresent()) {
            Student student = existingStudent.get();
            student.setName(studentDetails.getName());
            student.setBranch(studentDetails.getBranch());
            return studentRepository.save(student);
        }
        return null; // Handle "student not found" case in the controller
    }

    @Override
    public String deleteStudent(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "Student deleted successfully!";
        } else {
            return "Student not found!";
        }
    }
}
