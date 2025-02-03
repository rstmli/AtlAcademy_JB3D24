package tr.student.ogrencikayit.dao.entity;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import tr.student.ogrencikayit.util.Gender;

import java.time.LocalDate;

@Entity
//@Data
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
@Table(name = "ogrenci")
public class OgrenciEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Gender gender;
//    private Long academy_id;
    @CreationTimestamp
    private LocalDate registerTime;

}
