package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {
    private Radio radio = new Radio();

    // Тесты Радио

    @Test
    public void shouldInitFields() {
        assertEquals(9, radio.getMaxRadioStation());
        assertEquals(0, radio.getMinRadioStation());
        assertEquals(100, radio.getMaxVolume());
        assertEquals(0, radio.getMinVolume());
    }

    @Test
    public void shouldSetMaxMinVolume() {
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetRightNumberStation() {
        radio.setCurrentRadioStation(100);
        assertEquals(0, radio.getCurrentRadioStation());
        radio.setCurrentRadioStation(-1);
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextMaxStation() {
        radio.setCurrentRadioStation(9);
        radio.increaseRadio();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldNextStation8To9() {
        radio.setCurrentRadioStation(8);
        radio.increaseRadio();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDownMinStation() {
        radio.setCurrentRadioStation(0);
        radio.decreaseRadio();
        assertEquals(9, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldDownStation() {
        radio.setCurrentRadioStation(1);
        radio.decreaseRadio();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldMaxVolumeNext() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeNext() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldVolumeDown() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldMinVolumeDown() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldMaxCountStation() {
        Radio radio = new Radio(50);
        radio.setCurrentRadioStation(49);
        assertEquals(49, radio.getCurrentRadioStation());
        radio.increaseRadio();
        assertEquals(0, radio.getCurrentRadioStation());
    }

    @Test
    public void shouldSetMaxVolume() {
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }


}