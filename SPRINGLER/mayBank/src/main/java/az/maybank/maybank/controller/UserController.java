package az.maybank.maybank.controller;

import az.maybank.maybank.dto.UserRequestDto;
import az.maybank.maybank.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/add")
    public void addUsers(@Valid @RequestBody UserRequestDto dto){
        userService.addUsers(dto);
    }
}
