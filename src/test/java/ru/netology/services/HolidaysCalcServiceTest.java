package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.HolydaysCalcService;

public class HolidaysCalcServiceTest {
    @Test
    void shouldCalcMounths() {
        HolidaysCalcService service = new HolidaysCalcService();
        int income = 10_000; // Доход
        int expenses = 3_000; // Траты в 1 месяц
        int threshold = 20_000; // Сумма накопления с которой можно уйти в отпуск
        int expected = 3; // Ожидаемое количество месяцев

        // Вызываем метод
        int months = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, months);
    }
    @Test
    void shouldCalcAnotherMounths() {
        HolidaysCalcService service = new HolidaysCalcService();
        int income = 100_000; // Доход
        int expenses = 60_000; // Траты в 1 месяц
        int threshold = 150_000; // Сумма накопления с которой можно уйти в отпуск
        int expected = 2; // Ожидаемое количество месяцев

        // Вызываем метод
        int months = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, months);
    }
}
