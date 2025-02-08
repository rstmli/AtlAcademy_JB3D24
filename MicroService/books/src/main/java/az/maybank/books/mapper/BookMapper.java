package az.maybank.books.mapper;

import az.maybank.books.dto.AliveninoDto;
import az.maybank.books.dto.BookResponseDto;
import az.maybank.books.dto.LibrafDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class BookMapper {
    private static  final String LIBRAFNAME = "libraf";
    private static final String ALIVENINO = "ali ve nino";


    public List<BookResponseDto> aliveninoDtoToListBookResponseDto(List<AliveninoDto> dtos){
        var dto = new ArrayList<BookResponseDto>();
        for(AliveninoDto a : dtos){
            dto.add(
                    BookResponseDto.builder().BookName(a.getName()).price(a.getPrice()).stock(a.getStock()).build()
            );
        }
        return dto;
    }

    public List<BookResponseDto> librafDtoToListBookResponseDto(List<LibrafDto> dtos){
        var dto = new ArrayList<BookResponseDto>();
        for(LibrafDto l : dtos){
            dto.add(
                    BookResponseDto.builder().BookName(l.getName()).price(l.getPrice()).stock(l.getStock()).build()
            );
        }
        return dto;
    }


    public Map<String,List<BookResponseDto>> categorizeBooks(List<LibrafDto> librafDtos,List<AliveninoDto> aliveninoDtos){
        Map<String,List<BookResponseDto>> categorizedBooks = new HashMap<>();
        categorizedBooks.put("Libraf kitapxanasi", librafDtoToListBookResponseDto(librafDtos));
        categorizedBooks.put("Ali ve Nino kitapxanasi", aliveninoDtoToListBookResponseDto(aliveninoDtos));
        return categorizedBooks;
    }



}