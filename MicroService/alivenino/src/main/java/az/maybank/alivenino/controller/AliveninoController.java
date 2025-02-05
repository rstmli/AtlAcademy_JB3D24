package az.maybank.alivenino.controller;

import az.maybank.alivenino.dto.AliveninoResponseDto;
import az.maybank.alivenino.service.AliveninoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/alivenino")
public class AliveninoController {
    private final AliveninoService aliveninoService;
    @GetMapping("/get")
    List<AliveninoResponseDto> getAll(){
        return aliveninoService.getAll();
    }
}
