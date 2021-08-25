package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    private Radio radio = new Radio();

    // Тесты Радио


    @Test
    public void shouldMaxRadioStation() {
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        assertEquals(radio.getCurrentRadioStation(), radio.getCurrentRadioStation());

    }

    @Test
    public void shouldSwitchStationFrom0To9() {
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStation(1);
        radio.setCurrentRadioStation(2);
        radio.setCurrentRadioStation(3);
        radio.setCurrentRadioStation(4);
        radio.setCurrentRadioStation(5);
        radio.setCurrentRadioStation(6);
        radio.setCurrentRadioStation(7);
        radio.setCurrentRadioStation(8);
        radio.setCurrentRadioStation(9);
        assertEquals(radio.getCurrentRadioStation(), radio.getCurrentRadioStation());

    }

    @Test
    public void shouldMaxRadioStationOverLimit() {
        radio.setCurrentRadioStation(radio.getMaxRadioStation() + 1);
        assertEquals(radio.getCurrentRadioStation(), radio.getCurrentRadioStation());

    }

    @Test
    public void shouldMaxRadioStationUnderLimit() {
        radio.setCurrentRadioStation(radio.getMinRadioStation() - 1);
        assertEquals(radio.getCurrentRadioStation(), radio.getCurrentRadioStation());

    }


    @Test
    public void shouldMinRadioStation() {
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        assertEquals(radio.getCurrentRadioStation(), radio.getCurrentRadioStation());

    }

    @Test
    public void shouldMaxRadioStationNextZeroStation() {
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.increaseRadio();
        assertEquals(radio.getCurrentRadioStation(), radio.getCurrentRadioStation());

    }

    @Test
    public void shouldMinRadioStationGetNineStation() {
        radio.setCurrentRadioStation(radio.getMinRadioStation());
        radio.decreaseRadio();
        assertEquals(radio.getCurrentRadioStation(), radio.getCurrentRadioStation());

    }

    @Test
    public void shouldIncreases2xFromMaxStation() {
        radio.setCurrentRadioStation(radio.getMaxRadioStation());
        radio.increaseRadio();
        radio.increaseRadio();
        assertEquals(radio.getCurrentRadioStation(), radio.getCurrentRadioStation());

    }

    @Test
    public void shouldIncreasesAndDecreaseFromFiveStation() {
        radio.setCurrentRadioStation(5);
        radio.increaseRadio();
        radio.decreaseRadio();
        assertEquals(radio.getCurrentRadioStation(), radio.getCurrentRadioStation());

    }

    // Тесты Звука

    @Test
    public void shouldMaxVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        assertEquals(radio.getCurrentVolume(), radio.getCurrentVolume());

    }

    @Test
    public void shouldMinVolume() {
        radio.setCurrentVolume(radio.getMinVolume());
        assertEquals(radio.getCurrentVolume(), radio.getCurrentVolume());

    }

    @Test
    public void shouldMaxVolumeOverLimit() {
        radio.setCurrentVolume(radio.getMaxVolume() + 1);
        assertEquals(radio.getCurrentVolume(), radio.getCurrentVolume());

    }

    @Test
    public void shouldMinVolumeUnderLimit() {
        radio.setCurrentVolume(radio.getMinVolume() - 1);
        assertEquals(radio.getCurrentVolume(), radio.getCurrentVolume());

    }

    @Test
    public void shouldMaxAndIncreaseVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        assertEquals(radio.getCurrentVolume(), radio.getCurrentVolume());

    }

    @Test
    public void shouldMinAndDecreaseVolume() {
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();
        assertEquals(radio.getCurrentVolume(), radio.getCurrentVolume());

    }

    @Test
    public void shouldIncreases2xAndDecreaseFromMaxVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        radio.decreaseVolume();
        radio.increaseVolume();
        assertEquals(radio.getCurrentVolume(), radio.getCurrentVolume());

    }

    @Test
    public void shouldIncreasesAndDecreaseFromNineVolume() {
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        radio.decreaseVolume();
        assertEquals(radio.getCurrentVolume(), radio.getCurrentVolume());

    }

    @Test
    public void shouldDecrease2xFromOneVolume() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        radio.decreaseVolume();
        assertEquals(radio.getCurrentVolume(), radio.getCurrentVolume());

    }

}