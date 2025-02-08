package az.maybank.goycayparfumary.dao.repository;

import az.maybank.goycayparfumary.dao.entity.ParfumEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParfumRepository extends JpaRepository<ParfumEntity,Long> {
}
