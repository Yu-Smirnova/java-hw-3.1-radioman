package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentStationActual() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        int expected = 8;
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
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.setCurrentStation(10);

        int expected = 9;
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
        Radio radio = new Radio();
        radio.setCurrentStation(9);

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
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.previousStation();

        int expected = 9;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void souldSetCurrentVolumeActual() {
        Radio radio = new Radio();

        radio.setCurrentVolume(7);

        int expected = 7;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void souldSetCurrentVolumeMaxAndAbove() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.setCurrentVolume(11);

        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void souldSetCurrentVolumeMinAndUnder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setCurrentVolume(-1);

        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeAnderMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolumeWhenCurrentVolumeIsMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolumeAboveMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.decreaseVolume();

        int expected = 5;
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