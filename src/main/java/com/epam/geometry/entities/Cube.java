package com.epam.geometry.entities;

import com.epam.geometry.logic.Generator;

public class Cube {
    private double side;
    private long id;
    private Point centerPoint;

    public Cube(double side, Point centerPoint, long id) {
        this.side = side;
        this.centerPoint = centerPoint;
        this.id = id;
    }

    public Cube(double side, Point centerPoint) {
        this.side = side;
        this.centerPoint = centerPoint;
        this.id = Generator.generateID();
    }

    public Cube(double side) {
        this.side = side;
        this.centerPoint = new Point();
        this.id = Generator.generateID();
    }

    public Cube(Cube cube) {
        this.centerPoint = cube.centerPoint;
        this.side = cube.side;
        this.id = Generator.generateID();
    }

    public long getId() {
        return id;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Cube)) {
            return false;
        }
        Cube other = (Cube) o;
        if (Double.doubleToLongBits(side) != Double.doubleToLongBits((other.side))) {
            return false;
        }
        if (centerPoint == null) {
            if (other.centerPoint != null) {
                return false;
            }
        } else if (!centerPoint.equals(other.centerPoint)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(side);
        result = prime * result + (int) temp;
        temp = centerPoint == null ? 0 : centerPoint.hashCode();
        result = prime * result + (int) temp;
        return result;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", id=" + id +
                ", centerPoint=" + centerPoint +
                '}';
    }
}