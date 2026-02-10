package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

public class CashbackHackServiceTest {

    @Test
    public void purchaseFor1000() {

        CashbackHackService service = new CashbackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void purchaseFor800() {

        CashbackHackService service = new CashbackHackService();

        int amount = 200;

        int expected = 800;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void purchaseFor0() {

        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }
}
