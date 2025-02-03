package az.maybank.maybank.dao.repository;

import az.maybank.maybank.dao.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UserEntity,Long> {
}
