package ru.netology.services;

public class Main {
    public static void main(String[] args) {
        WorkVacationCalc service = new WorkVacationCalc();
        int count = service.calculateVacation(100000, 60000, 150000);
        System.out.println("Количество отпусков = " + count);
    }
}