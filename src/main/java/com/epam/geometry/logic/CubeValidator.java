package com.epam.geometry.logic;

public class CubeValidator {
    private static final String NUMBER_PATTERN = "[-]?\\d+\\.?\\d*";

    public boolean isValid(String lineFromFile) {

        String[] values = lineFromFile.split(" ");
        /*
         * side, pointX, pointY, pointZ*/
        if (values.length != 4) {
            return false;
        }
        for (int i = 0; i < values.length; i++) {
            if (!values[i].matches(NUMBER_PATTERN)) {
                return false;
            }
        }
        if (!isCube(lineFromFile)) {
            return false;
        }
        return true;
    }

    private boolean isCube(String lineFromFile) {
        String[] values = lineFromFile.split(" ");
        /*
         * side should be non-negative number */
        if (Double.valueOf(values[0]) > 0) {
            return true;
        }
        return false;
    }
}
