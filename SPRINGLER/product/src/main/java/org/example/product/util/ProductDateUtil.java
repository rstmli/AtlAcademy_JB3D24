package org.example.product.util;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class ProductDateUtil {
    public static String getFormetter(LocalDateTime time, boolean showTime){
        if(showTime){
            return time.format(DateTimeFormatter.ofPattern("dd:MM:yyyy"));
        }
        return time.format(DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mm:ss"));
    }
}
