package ru.netology.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setNumber() {
        Radio number = new Radio();
        number.setChanelNumber(5);

        int expected = 5;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseNumber() {
        Radio number = new Radio();
        number.setDecreaseClanel(5);

        int expected = 4;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseNumber() {
        Radio number = new Radio();
        number.setIncreaseClanel(5);

        int expected = 6;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberMax() {
        Radio number = new Radio();
        number.setChanelNumber(10);

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNumberMin() {
        Radio number = new Radio();
        number.setChanelNumber(-1);

        int expected = 9;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }






    @Test
    public void dncreaseVolume() {
        Radio volume = new Radio();
        volume.setDecreaseVolume(55);

        int expected = 54;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio volume = new Radio();
        volume.setIncreaseVolume(55);

        int expected = 56;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMax() {
        Radio volume = new Radio();
        volume.setVolume(101);

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeMin() {
        Radio volume = new Radio();
        volume.setVolume(-1);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }












}
