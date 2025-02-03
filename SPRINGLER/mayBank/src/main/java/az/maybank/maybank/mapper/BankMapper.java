package az.maybank.maybank.mapper;

import az.maybank.maybank.dao.entity.BankEntity;
import az.maybank.maybank.dao.entity.UserEntity;
import az.maybank.maybank.dao.repository.BankRepository;
import az.maybank.maybank.dto.BankResponseDto;
import az.maybank.maybank.dto.UserResponseDto;
import az.maybank.maybank.util.exception.BankNotFoundException;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Data
@Component
public class BankMapper {
    private final BankRepository bankRepository;

    public BankResponseDto entityToDto(Long id){
        BankEntity entity = bankRepository.findById(id).orElseThrow( () -> new BankNotFoundException("not found by id"));
        List<UserEntity> userEntities = entity.getUserEntityList();
        List<UserResponseDto> user = new ArrayList<>();


        for(UserEntity e : userEntities){
            user.add(
                    UserResponseDto.builder().name(e.getName()).surname(e.getSurname()).build());
        }
        return BankResponseDto.builder().name(entity.getName()).userEntityList(user).build();
    }


    public List<BankResponseDto> entityListToDto(List<BankEntity> bankEntities){
        List<BankResponseDto> bankDtos = new ArrayList<>();
        for(BankEntity bank : bankEntities){
            List<UserResponseDto> userDtos = new ArrayList<>();
            for(UserEntity user : bank.getUserEntityList()){
                UserResponseDto userdto = UserResponseDto.builder().name(user.getName()).surname(user.getSurname()).build();
                userDtos.add(userdto);
            }
            BankResponseDto bankDto = BankResponseDto.builder().name(bank.getName()).userEntityList(userDtos).build();
            bankDtos.add(bankDto);
        }
        return bankDtos;
    }






}
