package az.maybank.maybank.dao.repository;

import az.maybank.maybank.dao.entity.BankEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<BankEntity,Long> {
}
