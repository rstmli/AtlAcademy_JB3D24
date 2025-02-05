package az.maybank.books.client;

import az.maybank.books.dto.AliveninoDto;
import az.maybank.books.dto.LibrafDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@FeignClient(name = "alivenino-client", url = "http://localhost:8801/api/v1/alivenino/")
public interface AliveninoClient {
        @RequestMapping(method = RequestMethod.GET , value = "get")
        List<AliveninoDto> getAll();
}
