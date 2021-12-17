package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBe0IfAmount1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldBe1IfAmount999() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldBe999IfAmount1001() {
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldBe0IfAmount2000() {
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldBe999IfAmount1() {
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldBe1000IfAmount0() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);

    }


}