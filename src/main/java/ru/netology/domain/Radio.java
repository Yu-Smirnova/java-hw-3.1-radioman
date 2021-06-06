package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentVolume + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void previousStation() {
        if (currentStation > 0) {
            currentStation = currentVolume - 1;
        }
        if (currentStation == 0) {
            currentStation = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            return;
        }
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        if (currentVolume > 0) {
            currentVolume = currentVolume + 1;
        }
    }
}