package com.epam.geometry.entities;

public class Cube {
    private double side;
    private Point centerPoint;

    public Cube(double side, Point centerPoint) {
        this.side = side;
        this.centerPoint = centerPoint;
    }

    public Cube(double side) {
        this.side = side;
        this.centerPoint = new Point();
    }

    public Cube(Cube cube) {
        this.centerPoint = cube.centerPoint;
        this.side = cube.side;
    }

    public double getSide() {
        return side;
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
                ", centerPoint=" + centerPoint +
                '}';
    }
}
