package ru.netology.services;
//import ru.netology.services.WorkVacationCalc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class WorkVacationCalcTest {

    @Test
    public void testVacationCalcLowSalary() {
        WorkVacationCalc service = new WorkVacationCalc();
        int expected = 3;
        int actual = service.calculateVacation(10000, 3000, 20000);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testVacationCalcHighSalary() {
        WorkVacationCalc service = new WorkVacationCalc();
        int expected = 2;
        int actual = service.calculateVacation(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);
    }
}