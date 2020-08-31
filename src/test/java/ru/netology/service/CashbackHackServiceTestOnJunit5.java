package ru.netology.service;

import org.junit.Test;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTestOnJunit5 {

    @Test
    public void lessThan1k() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void evenly1k() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void moreThan1k() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1700;

        int actual = service.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);
    }

    @Test
    public void roundedToRubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 937;

        int actual = service.remain(amount);
        int expected = 63;

        assertEquals(expected, actual);
    }
}