package tr.student.ogrencikayit.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.student.ogrencikayit.dao.entity.OgrenciEntity;
@Repository
public interface OgrenciRepository extends JpaRepository<OgrenciEntity,Long> {

}
