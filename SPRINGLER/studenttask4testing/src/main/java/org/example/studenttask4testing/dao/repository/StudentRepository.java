package org.example.studenttask4testing.dao.repository;

import org.example.studenttask4testing.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
}
