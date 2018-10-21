package com.epam.geometry.logic;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.entities.Point;

import java.util.ArrayList;
import java.util.List;

public class DataParser {

    private Validator validator;

    DataParser(Validator validator) {
        this.validator = validator;
    }

    public Cube parseCube(String string) {
        if (!validator.isValid(string)) {
            return null;
        }

        String[] values = string.split(" ");

        Point point = new Point(Double.valueOf(values[1]), Double.valueOf(values[2]), Double.valueOf(values[3]));

        return new Cube(Double.valueOf(values[0]), point);
    }

    public List<Cube> parseCubes(List<String> stringList) {

        List<Cube> cubeList = new ArrayList<>();

        for (String string : stringList) {
            if (validator.isValid(string)) {
                String[] values = string.split(" ");
                Point point = new Point(Double.valueOf(values[1]), Double.valueOf(values[2]), Double.valueOf(values[3]));
                Cube cube = new Cube(Double.valueOf(values[0]), point);
                cubeList.add(cube);
            }
        }

        return cubeList;
    }
}
