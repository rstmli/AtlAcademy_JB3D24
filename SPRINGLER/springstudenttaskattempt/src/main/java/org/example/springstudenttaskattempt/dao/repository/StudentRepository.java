package org.example.springstudenttaskattempt.dao.repository;

import org.example.springstudenttaskattempt.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
