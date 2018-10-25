package com.epam.geometry.entities;

import java.util.Objects;

public class CubeValues {
    private long id;
    private double square;
    private double volume;

    public CubeValues(long id, double square, double volume) {
        this.id = id;
        this.square = square;
        this.volume = volume;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CubeValues that = (CubeValues) o;
        return id == that.id &&
                Double.compare(that.square, square) == 0 &&
                Double.compare(that.volume, volume) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, square, volume);
    }

    @Override
    public String toString() {
        return "CubeValues{" +
                "id=" + id +
                ", square=" + square +
                ", volume=" + volume +
                '}';
    }
}
