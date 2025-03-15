package ru.netology.javaga;

import ru.netology.services.monhtsclass;

public class Main {
    public static void main(String[] args) {
        monhtsclass service = new monhtsclass();

        int vacations = service.calculate(100000, 60000, 150000);
        System.out.println(vacations);
    }
}