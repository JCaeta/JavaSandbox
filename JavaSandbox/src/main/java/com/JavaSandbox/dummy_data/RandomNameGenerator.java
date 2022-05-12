package com.RecursosTecnologicos.dummy_data;

public class RandomNameGenerator {
    static public String getName() {
        String[] names = {"John", "Mary", "Peter", "Sara", "Paul", "Anna", "Jenny", "Jessica", "Mark", "Linda", "George", "Elizabeth"};
        int randomIndex = (int) (Math.random() * names.length);
        return names[randomIndex];
    }
}
