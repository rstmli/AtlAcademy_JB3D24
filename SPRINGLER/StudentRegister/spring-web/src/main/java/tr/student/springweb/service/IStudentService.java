package tr.student.springweb.service;

import tr.student.springweb.model.Student;

import java.util.List;

/**
 * @author Simpson Alfred
 */

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentById(Long id);
    void deleteStudent(Long id);
}
