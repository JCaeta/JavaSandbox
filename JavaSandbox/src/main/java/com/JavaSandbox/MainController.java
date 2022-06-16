package com.JavaSandbox;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;

import org.springframework.stereotype.Controller;

@Controller
public class MainController
{

    public MainController(){
        algorithm0();
        // algorithm1();
    }

    public void algorithm0(){
        // Batch bidimensional string array by field
        System.out.println ("algorithm0");
        String datosRecursos [][] = {
            {"Computadora", "1", "HP", "HP-123"},
            {"Impresora", "2", "Samsung", "Smg-123"},
            {"Monitor", "3", "Dell", "Dell-123"},
            {"Computadora", "4", "HP", "HP-456"},
            {"Impresora", "5", "HP", "Smg-456"},
            {"Monitor", "6", "Dell", "Dell-456"},
            {"Computadora", "7", "MSI", "HP-789"},
            {"Impresora", "8", "Samsung", "Smg-789"},
        };
        for(String [] row : datosRecursos){
            System.out.println(row[0] + " | " + row[1] + " | " + row[2] + " | " + row[3]);
        }

        // Arrays.sort(datosRecursos, (String[] a, String[] b) -> {
        //     if (a[0].equals(b[0])) {
        //         return a[1].compareTo(b[1]);
        //     } else {
        //         int comparison = a[0].compareTo(b[0]);
        //         return a[0].compareTo(b[0]);
        //     }
        // });

        // Inverting order
        Arrays.sort(datosRecursos, (String[] b, String[] a) -> {
            if (a[0].equals(b[0])) {
                return a[1].compareTo(b[1]);
            } else {
                return a[0].compareTo(b[0]);
            }
        });


        System.out.println("\n\n");
        for(String [] row : datosRecursos){
            System.out.println(row[0] + " | " + row[1] + " | " + row[2] + " | " + row[3]);
        }
    }

    public void algorithm1()
    {
        // Basics of date and time

        //Create date objects
        LocalDate date0 = LocalDate.of(2022, 2, 28);
        LocalDate date1 = LocalDate.of(2022, Month.FEBRUARY, 28);

        // Create time objects
        LocalTime time0 = LocalTime.of(12, 30, 45);
        LocalTime time1 = LocalTime.of(12, 30);

        //Create datetime objects
        LocalDateTime dateTime0 = LocalDateTime.of(date0, time0);
        LocalDateTime dateTime1 = LocalDateTime.of(2022, 2, 28, 12, 30, 45);
        LocalDateTime dateTime2 = LocalDateTime.of(2022, Month.AUGUST, 28, 12, 30);

        System.out.println("date0: " + date0);
        System.out.println("date1: " + date1);
        System.out.println("time0: " + time0);
        System.out.println("time1: " + time1);
        System.out.println("dateTime0: " + dateTime0);
        System.out.println("dateTime1: " + dateTime1);
        System.out.println("dateTime2: " + dateTime2);

        // Compare date0 with dateTime2
        LocalDate dateTime2Comparing = LocalDate.of(dateTime2.getYear(), dateTime2.getMonth(), dateTime2.getDayOfMonth());
        boolean isAfter = date0.isAfter(dateTime2Comparing);
        System.out.println("isAfter: " + isAfter);


        // System.out.println("date0.equals(dateTime2Comparing): " + dateTime2Comparing.isAfter(date0));
    }
}
