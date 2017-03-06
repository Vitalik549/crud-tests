package com.crud.helpers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateHelper {

    public static DateTimeFormatter defaultFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yyyy-M-d");
    public static DateTimeFormatter tableFormat = DateTimeFormatter.ofPattern("dd MMM yyyy");

    public static String convertToDefaultFormat(String date, DateTimeFormatter formatOfDate) {
        return LocalDate.parse(date, formatOfDate).format(defaultFormat);
    }
}
