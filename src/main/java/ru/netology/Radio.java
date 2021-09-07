package ru.netology;

public class Radio {
    // Радио
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    // Звук
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    //Работа с радио

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }


    // Работа с громкостью

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    // Переключение Радио

    public void increaseRadio() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void decreaseRadio() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    //Переключение звука

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
