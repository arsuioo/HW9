package ru.netology.servises;

public class Radio {

    public int chanelNumber;

    public int getChanelNumber(){
        return chanelNumber;
    }

    public void setIncreaseClanel(int newChanelNumber) {
        if (newChanelNumber < 9) {
            newChanelNumber = newChanelNumber + 1;
        }
        chanelNumber = newChanelNumber;
    }

    public void setDecreaseClanel(int newChanelNumber) {
        if (newChanelNumber > 0 ) {
            newChanelNumber = newChanelNumber - 1;
        }
        chanelNumber = newChanelNumber;
    }


    public void setChanelNumber(int newChanelNumber){
        if (newChanelNumber < 0){
            newChanelNumber = 9;
        }
        if (newChanelNumber > 9){
            newChanelNumber = 0;
        }
        chanelNumber = newChanelNumber;
    }

    public int Volume;

    public int getVolume(){
        return Volume;
    }

    public void setIncreaseVolume(int newVolume) {
        if (newVolume < 100) {
            newVolume = newVolume + 1;
        }
        Volume = newVolume;
    }

    public void setDecreaseVolume(int newVolume) {
        if (newVolume > 0 ) {
            newVolume = newVolume - 1;
        }
        Volume = newVolume;
    }


    public void setVolume(int newVolume){
        if (newVolume < 0){
            newVolume = 0;
        }
        if (newVolume > 100){
            newVolume = 100;
        }
        Volume = newVolume;
    }











}