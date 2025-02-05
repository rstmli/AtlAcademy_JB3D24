package az.maybank.libraf.controller;

import az.maybank.libraf.dto.LibrafResponseDto;
import az.maybank.libraf.service.LibrafService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/libraf")
public class LibrafController {
    private final LibrafService librafService;
    @GetMapping("/get")
    public List<LibrafResponseDto> getAll(){
        return librafService.getAll();
    }

}
