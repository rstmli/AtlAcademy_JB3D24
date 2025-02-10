package az.otp.otp.dao.repository;

import az.otp.otp.dao.entity.OtpEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface OtpRepository extends JpaRepository<OtpEntity, Long> {

  Optional<OtpEntity> findByMsisdn(String msisdn);
  void deleteByExpireTimeBefore(LocalDateTime expireTime);
}
