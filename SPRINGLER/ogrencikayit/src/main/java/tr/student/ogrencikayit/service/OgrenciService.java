package tr.student.ogrencikayit.service;

import tr.student.ogrencikayit.dao.entity.OgrenciEntity;
import tr.student.ogrencikayit.dto.OgrenciResponseDto;
import tr.student.ogrencikayit.dto.OgrenciReuqestDto;

import java.util.List;

public interface OgrenciService {
    void addStudent(OgrenciReuqestDto dto);
    List<OgrenciResponseDto> getOgrenci();
    OgrenciResponseDto getById(Long id);
}
