package az.maybank.books.client;

import az.maybank.books.dto.LibrafDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "libraf-client" , url = "http://194.105.5.229:8800/api/v1/libraf")
public interface LibrafClient {
    @RequestMapping(method = RequestMethod.GET , value = "/get")
    List<LibrafDto> getAll();
}
