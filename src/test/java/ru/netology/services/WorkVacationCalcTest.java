package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class WorkVacationCalcTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/inputs_vacation.csv")
    public void testVacationCalcLowSalary(int expected, int income, int expenses, int threshold) {
        WorkVacationCalc service = new WorkVacationCalc();
        int actual = service.calculateVacation(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}