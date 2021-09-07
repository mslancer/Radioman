package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    private Radio radio = new Radio();

    // Тесты Радио

    @Test
    public void shouldMaxRadioStation() {
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldMinRadioStation() {
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldMaxRadioStationNextZeroStation() {
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.increaseRadio();
        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldMinRadioStationGetNineStation() {
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.decreaseRadio();
        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldIncreases2xFromMaxStation() {
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.increaseRadio();
        radio.increaseRadio();
        assertEquals(1, radio.getCurrentRadioStation());

    }

    @Test
    public void shouldIncreasesAndDecreaseFromFiveStation() {
        radio.setCurrentRadioStation(5);
        radio.increaseRadio();
        radio.decreaseRadio();
        assertEquals(5, radio.getCurrentRadioStation());

    }

    // Тесты Звука

    @Test
    public void shouldMaxVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        assertEquals(10, radio.getCurrentVolume());

    }

    @Test
    public void shouldMinVolume() {
        radio.setCurrentVolume(radio.getMinVolume());
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldMaxAndIncreaseVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(9, radio.getCurrentVolume());

    }

    @Test
    public void shouldMinAndDecreaseVolume() {
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void shouldIncreases2xAndDecreaseFromMaxVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        radio.decreaseVolume();
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());

    }

    @Test
    public void shouldIncreasesAndDecreaseFromNineVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        radio.decreaseVolume();
        assertEquals(9, radio.getCurrentVolume());

    }


}
