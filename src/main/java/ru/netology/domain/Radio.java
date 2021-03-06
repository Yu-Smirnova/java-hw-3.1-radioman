package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int numberOfStations = 10;
    private int currentStation;
    private int currentVolume;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void setNumberOfStations(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0 || currentStation > numberOfStations - 1) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation == numberOfStations - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void previousStation() {
        if (currentStation == 0) {
            currentStation = numberOfStations - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0 || currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        }
        currentVolume = currentVolume + 1;
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume = currentVolume - 1;
    }
}