package az.student.studentapp.dao.repository;

import az.student.studentapp.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>{
    @Query(value = "select * from student where name = :name",nativeQuery = true)
    List<StudentEntity> getname(@Param("name") String name);
}
