package az.maybank.libraf.dao.repository;

import az.maybank.libraf.dao.entity.LibrafEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibrafRepository extends JpaRepository<LibrafEntity,Long> {
}
