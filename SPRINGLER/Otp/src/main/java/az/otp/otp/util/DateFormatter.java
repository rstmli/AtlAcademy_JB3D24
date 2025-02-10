package az.otp.otp.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    public static String dateFormatters(LocalDateTime time){

        if(time == null){
            return null;
        }
        return time.format(DateTimeFormatter.ofPattern("dd:MM:yyyy H:m:s"));
    }
}
