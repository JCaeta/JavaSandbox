package com.JavaSandbox;
import java.util.Arrays;

import org.springframework.stereotype.Controller;

@Controller
public class MainController
{
    public MainController(){
        algorithm0();
    }

    public void algorithm0(){
        System.out.println("algorithm0");
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

        Arrays.sort(datosRecursos, (String[] a, String[] b) -> {
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
}
