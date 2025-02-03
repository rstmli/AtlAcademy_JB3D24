package az.student.studentapp.dao.repository;

import az.student.studentapp.dao.entity.StudentEntity;
import az.student.studentapp.dto.JoinDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepositorys extends JpaRepository<StudentEntity, Long>{
    @Query(value = "select * from student where name = :name",nativeQuery = true)
    List<StudentEntity> getname(@Param("name") String name);

    @Query(value = "SELECT s.name as studentName, s.surname as studentSurname, a.name as academyName from student s " +
            "left join academy a on a.id = s.academy_id ",nativeQuery = true)
    List<Object[]> leftJoin();

    @Query(value = "SELECT s.name as studentName, s.surname as studentSurname, a.name as academyName from student s " +
            "right join public.academy a on a.id = s.academy_id ",nativeQuery = true)
    List<JoinDto> rightJoin();

    @Query(value = "SELECT s.name as studentName, s.surname as studentSurname, a.name as academyName from student s " +
            "inner join public.academy a on a.id = s.academy_id ",nativeQuery = true)
    List<JoinDto> innerJoin();

    @Query(value = "SELECT s.name as studentName, s.surname as fidan, a.name as academyName from student s " +
            "full join public.academy a on a.id = s.academy_id ",nativeQuery = true)
    List<JoinDto> fullJoin();
}
