package main.java.ejercicio_13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main_trece {
    public static void main(String[] args) {

        DateTimeFormatter format = DateTimeFormatter.ofPattern("(yyyy/MM/dd) (HH:mm:ss)");
        String dateTime = LocalDateTime.now().format(format);
        System.out.println(dateTime);
    }

}
