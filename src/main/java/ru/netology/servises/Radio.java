package ru.netology.servises;

public class Radio {
    private int chanelNumber;

    public int getChanelNumber() {
        return chanelNumber;
    }

    public void setNumber(int newChanelNumber) {
        if (newChanelNumber < 10 && newChanelNumber > -1) {
            chanelNumber = newChanelNumber;
        } else {
            return;
        }
    }

    public void setNext(int newChanelNumber) {
        if (newChanelNumber < 9) {
            chanelNumber = newChanelNumber + 1;
        } else if (newChanelNumber == 9) {
            chanelNumber = 0;
        }
    }

    public void setPrev(int newChanelNumber) {
        if (newChanelNumber > 0) {
            chanelNumber = newChanelNumber - 1;
        } else if (newChanelNumber == 0) {
            chanelNumber = 9;
        }
    }


    private int Volume;

    public int getVolume() {
        return Volume;
    }

    public void setMoreVolume(int newVolume) {
        if (newVolume < 100 && newVolume >= 0) {
            Volume = newVolume + 1;
        } else if (newVolume >= 100) {
            Volume = 100;
        }
    }

    public void setLessVolume(int newVolume) {
        if (newVolume > 0 && newVolume <= 100) {
            Volume = newVolume - 1;
        } else if (newVolume < 0) {
            Volume = 0;
        }
        else if (newVolume > 100) {
            Volume = 100;
        }
    }

}






















