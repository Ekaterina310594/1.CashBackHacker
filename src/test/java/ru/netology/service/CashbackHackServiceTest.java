package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void lessThanBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 200;

        int expected = 800;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void equalToTheBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void moreBorder() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }


}