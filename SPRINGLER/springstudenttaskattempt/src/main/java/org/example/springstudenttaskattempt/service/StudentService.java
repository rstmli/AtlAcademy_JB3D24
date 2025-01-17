package org.example.springstudenttaskattempt.service;

import lombok.Builder;
import lombok.Data;
import org.example.springstudenttaskattempt.dto.StudentRequestsDto;
import org.springframework.stereotype.Service;

public interface StudentService {
    void addStudent(StudentRequestsDto dto);
}
