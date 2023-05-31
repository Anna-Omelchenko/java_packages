package ru.netology.services;

public class WorkVacationCalc {
    public int calculateVacation(int income, int expenses, int threshold) {
        int count = 0; // подсчет количества отпусков в штуках
        int account = 0; // остаток на счете
        for (int month = 0; month < 12; month++) // количество итераций 12 раз в году
            if (account >= threshold) {
                account = (account - expenses) / 3; // отдыхаем
                count++; // увеличиваем счётчик месяцев отдыха
            } else {
                account = account + income - expenses; //работаем
            }
        return count;
    }
}