package com.epam.geometry.logic;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;

import java.util.ArrayList;
import java.util.List;

public class DataParser {

    private CubeValidator cubeValidator;

    DataParser(CubeValidator cubeValidator) {
        this.cubeValidator = cubeValidator;
    }

    public Cube parseCube(String string) {
        if (!cubeValidator.isValid(string)) {
            return null;
        }

        String[] values = string.split(" ");

        String stringPointX = values[1];
        String stringPointY = values[2];
        String stringPointZ = values[3];

        Point point = new Point(Double.valueOf(stringPointX),
                Double.valueOf(stringPointY),
                Double.valueOf(stringPointZ));

        String cubeSide = values[0];

        return new Cube(Double.valueOf(cubeSide), point);
    }

    public List<Cube> parseCubes(List<String> stringList) {

        List<Cube> cubeList = new ArrayList<>();

        for (String string : stringList) {
            if (cubeValidator.isValid(string)) {
                String[] values = string.split(" ");

                String stringPointX = values[1];
                String stringPointY = values[2];
                String stringPointZ = values[3];

                Point point = new Point(Double.valueOf(stringPointX),
                        Double.valueOf(stringPointY),
                        Double.valueOf(stringPointZ));

                String cubeSide = values[0];
                Cube cube = new Cube(Double.valueOf(cubeSide), point);

                cubeList.add(cube);
            }
        }

        return cubeList;
    }
}
