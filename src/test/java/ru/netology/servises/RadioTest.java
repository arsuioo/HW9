package ru.netology.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void getNumberOver() {
        Radio number = new Radio();

        number.setNumber(55);

        int expected = 9;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getNumberMinus() {
        Radio number = new Radio();

        number.setNumber(-10);

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextNumber() {
        Radio number = new Radio();

        number.setNumber(8);
        number.setNext();

        int expected = 9;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberNine() {
        Radio number = new Radio();

        number.setNumber(9);
        number.setNext();

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextNumberTwenty() {
        Radio number = new Radio(20);

        number.setNumber(19);
        number.setNext();

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberOne() {
        Radio number = new Radio();

        number.setNumber(1);
        number.setPrev();

        int expected = 0;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberTwenty() {
        Radio number = new Radio(20);

        number.setNumber(19);
        number.setPrev();

        int expected = 18;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevNumberMinus() {
        Radio number = new Radio();

        number.setNumber(-10);
        number.setPrev();

        int expected = 9;
        int actual = number.getChanelNumber();

        Assertions.assertEquals(expected, actual);
    }

    // Звук

    @Test
    public void VolumeMore() {
        Radio volume = new Radio();

        volume.setVolume(110);


        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolumeMinus() {
        Radio volume = new Radio();

        volume.setVolume(-10);
        volume.setMoreVolume();


        int expected = 1;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMore() {
        Radio volume = new Radio();

        volume.setVolume(110);
        volume.setMoreVolume();

        int expected = 100;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLessMinus() {
        Radio volume = new Radio();

        volume.setVolume(-10);
        volume.setLessVolume();

        int expected = 0;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeLess() {
        Radio volume = new Radio();

        volume.setVolume(50);
        volume.setLessVolume();

        int expected = 49;
        int actual = volume.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}









