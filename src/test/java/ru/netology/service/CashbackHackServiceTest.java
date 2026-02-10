package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void purchaseFor1000() {

        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void purchaseFor800() {

        CashbackHackService service = new CashbackHackService();

        int amount = 200;

        int expected = 800;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void purchaseFor0() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}
