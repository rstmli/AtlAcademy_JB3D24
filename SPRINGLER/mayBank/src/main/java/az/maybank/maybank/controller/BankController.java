package az.maybank.maybank.controller;

import az.maybank.maybank.dto.BankResponseDto;
import az.maybank.maybank.dto.UserRequestDto;
import az.maybank.maybank.dto.UserResponseDto;
import az.maybank.maybank.service.BankService;
import az.maybank.maybank.service.UserService;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bank")
@RequiredArgsConstructor
@Validated
public class BankController {
    private final BankService bankService;
    private final UserService userService;

    @GetMapping("/get")
    public List<BankResponseDto> getAll(){
        return bankService.getall();
    }
    @GetMapping("/get/{id}")
    public BankResponseDto getById(@PathVariable Long id){
        return bankService.getById(id);
    }

}
