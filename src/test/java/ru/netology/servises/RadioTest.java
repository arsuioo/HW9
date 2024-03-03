package ru.netology.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void getNumber() {
        Radio number = new Radio();

        number.setNumber(5);

        int expected = 5;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOver() {
        Radio number = new Radio();

        number.setNumber(55);

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNumberLess() {
        Radio number = new Radio();

        number.setNumber(-1);

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void getNumberNine() {
        Radio number = new Radio();

        number.setNumber(9);

        int expected = 9;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNumberZero() {
        Radio number = new Radio();

        number.setNumber(0);

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumber() {
        Radio number = new Radio();

        number.setNext(8);

        int expected = 9;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberTen() {
        Radio number = new Radio();

        number.setNext(10);

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberZero() {
        Radio number = new Radio();

        number.setNext(9);

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumber() {
        Radio number = new Radio();

        number.setPrev(5);

        int expected = 4;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberNine() {
        Radio number = new Radio();

        number.setPrev(0);

        int expected = 9;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNumberEight() {
        Radio number = new Radio();

        number.setPrev(9);

        int expected = 8;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberZero() {
        Radio number = new Radio();

        number.setPrev(1);

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevNumberTest() {
        Radio number = new Radio();

        number.setPrev(-1);

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

// Звук
    @Test
    public void nextVolume() {
        Radio volume = new Radio();

        volume.setMoreVolume(50);

        int expected = 51;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMore() {
        Radio volume = new Radio();

        volume.setMoreVolume(100);

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeMoreOneHundred() {
        Radio volume = new Radio();

        volume.setMoreVolume(111);

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeMoreMinus() {
        Radio volume = new Radio();

        volume.setMoreVolume(-10);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLess() {
        Radio volume = new Radio();

        volume.setLessVolume(55);

        int expected = 54;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeLess() {
        Radio volume = new Radio();

        volume.setLessVolume(0);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolumeHundrid() {
        Radio volume = new Radio();

        volume.setLessVolume(-10);

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLessMinus() {
        Radio volume = new Radio();

        volume.setLessVolume(100);

        int expected = 99;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLessMoreOneHundrid() {
        Radio volume = new Radio();

        volume.setLessVolume(120);

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}









