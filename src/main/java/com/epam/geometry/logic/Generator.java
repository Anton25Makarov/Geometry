package com.epam.geometry.logic;

public class Generator {

    private static final long MIN_VALUE = 0L;
    private static final long MAX_VALUE = 1000000L;
    private static long nextID = MIN_VALUE;

    public static long generateID() {
        if (nextID > MAX_VALUE) {
            nextID = MIN_VALUE;
        }
        return nextID++;
    }
}
