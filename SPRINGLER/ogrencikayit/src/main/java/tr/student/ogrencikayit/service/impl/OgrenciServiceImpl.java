package tr.student.ogrencikayit.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tr.student.ogrencikayit.dao.entity.OgrenciEntity;
import tr.student.ogrencikayit.dao.repository.OgrenciRepository;
import tr.student.ogrencikayit.dto.OgrenciResponseDto;
import tr.student.ogrencikayit.dto.OgrenciReuqestDto;
import tr.student.ogrencikayit.mapper.OgrenciMapper;
import tr.student.ogrencikayit.service.OgrenciService;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OgrenciServiceImpl implements OgrenciService {
    private final OgrenciRepository ogrenciRepository;
    private final OgrenciMapper ogrenciMapper;



    @Override
    public void addStudent(OgrenciReuqestDto dto) {
        var entity = OgrenciEntity.builder()
                .name(dto.getName())
                .surname(dto.getSurname())
                .gender(dto.getGender())
                .build();
        ogrenciRepository.save(entity);

    }

    @Override
    public List<OgrenciResponseDto> getOgrenci() {
        List<OgrenciEntity> entity = ogrenciRepository.findAll();
        return ogrenciMapper.entityListToDto(entity);
    }

    @Override
    public OgrenciResponseDto getById(Long id) {

        Optional<OgrenciEntity> optionalOgrenciEntity = ogrenciRepository.findById(id);
        OgrenciEntity entity = new OgrenciEntity();
        if(optionalOgrenciEntity.isPresent()){
           return  ogrenciMapper.entityToDto(optionalOgrenciEntity.get());
        }


        return ogrenciMapper.entityToDto(entity);
    }
}
