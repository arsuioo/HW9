package ru.netology.servises;

public class Radio {
    private int volume;
    private int chanelNumber;

    private int maxChanell;

    public Radio() {
        maxChanell = 10;
    }

    public Radio(int maxChanell) {

        this.maxChanell = maxChanell;
    }


    public int getChanelNumber() {//

        return chanelNumber;
    }


    public int getVolume() {
        return volume;
    }

    public void setNumber(int newChanelNumber) {
        if (newChanelNumber > maxChanell - 1) {
            chanelNumber = maxChanell - 1;
        } else if (newChanelNumber < 0) {
            chanelNumber = 0;
        } else {
            chanelNumber = newChanelNumber;
        }
    }

    public void setNext() {
        chanelNumber++;
        if (chanelNumber > maxChanell - 1) {
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






















