package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HolidaysCalcServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Holiday.csv")
    void shouldCalcMounths(int income, int expenses, int threshold, int expected) {
        HolidaysCalcService service = new HolidaysCalcService();

        // Вызываем метод
        int months = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, months);
    }
}