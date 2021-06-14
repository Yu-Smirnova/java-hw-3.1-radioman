package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetNumberOfStations() {
        Radio radio = new Radio();
        radio.setNumberOfStations(25);

        int expected = 25;

        assertEquals(expected, radio.getNumberOfStations());
    }

    @Test
    void shouldSetCurrentStationActual() {
        Radio radio = new Radio(50);

        radio.setCurrentStation(47);

        int expected = 47;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationFirstAndBeforeFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.setCurrentStation(-1);

        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationLastAndAfterLastStation() {
        Radio radio = new Radio(30);
        radio.setCurrentStation(29);

        radio.setCurrentStation(30);

        int expected = 29;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationBeforeLastStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.nextStation();

        int expected = 6;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationWhenCurrentIsLastStation() {
        Radio radio = new Radio(35);
        radio.setCurrentStation(34);

        radio.nextStation();

        int expected = 0;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetPreviousStationAfterFirstStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);

        radio.previousStation();

        int expected = 1;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetPreviousStationWhenCurrentIsFirstStation() {
        Radio radio = new Radio(28);
        radio.setCurrentStation(0);

        radio.previousStation();

        int expected = 27;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentVolumeActual() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);

        int expected = 55;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentVolumeMaxAndAbove() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.setCurrentVolume(101);

        int expected = 100;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentVolumeMinAndUnder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setCurrentVolume(-1);

        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAnderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(55);

        radio.increaseVolume();

        int expected = 56;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeWhenCurrentVolumeIsMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(65);

        radio.decreaseVolume();

        int expected = 64;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeWhenCurrentVolumeIsMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }
}