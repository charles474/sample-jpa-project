package com.tutorial.samplejpaproject.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class DateUtils {

    public String getDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        LocalDateTime localDateTime = LocalDateTime.now();
        return dateTimeFormatter.format(localDateTime);
    }

}
