package ru.netology.servises;

public class Radio {
    private int chanelNumber;
    private int volume;

    public int getChanelNumber() {
        return chanelNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setNumber(int newChanelNumber) {
        if (newChanelNumber > 9) {
            chanelNumber = 9;
        } else if (newChanelNumber < 0) {
            chanelNumber = 0;
        } else {
            chanelNumber = newChanelNumber;
        }
    }

    public void setNext() {
        chanelNumber++;
        if (chanelNumber > 9) {
            chanelNumber = 0;
        }
    }


    public void setPrev() {
        chanelNumber--;
        if (chanelNumber < 0) {
            chanelNumber = 9;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume >= 0 && newVolume <= 100) {
            volume = newVolume;
        } else if (newVolume > 100) {
            volume = 100;
        }
    }

    public void setMoreVolume() {
        if (volume < 100) {
            volume++;
        } else {
            volume = 100;
        }
    }

    public void setLessVolume() {
        if (volume > 0) {
            volume--;
        } else {
            volume = 0;
        }
    }

}






















