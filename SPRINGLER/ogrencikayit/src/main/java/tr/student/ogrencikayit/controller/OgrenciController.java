package tr.student.ogrencikayit.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tr.student.ogrencikayit.dto.OgrenciResponseDto;
import tr.student.ogrencikayit.dto.OgrenciReuqestDto;
import tr.student.ogrencikayit.service.OgrenciService;

import java.io.OutputStream;
import java.util.List;

@RestController
@RequestMapping("/ogrenci")
@RequiredArgsConstructor
public class OgrenciController {
    private final OgrenciService ogrenciService;

    @PostMapping("/add")
    public void addOgrenci(@RequestBody OgrenciReuqestDto dto){
        ogrenciService.addStudent(dto);
    }

    @GetMapping("/get")
    public List<OgrenciResponseDto> getOgrenci(){
        return ogrenciService.getOgrenci();
    }

    @GetMapping("/get/{id}")
    public OgrenciResponseDto getById(@PathVariable Long id){
        return ogrenciService.getById(id);
    }

}
