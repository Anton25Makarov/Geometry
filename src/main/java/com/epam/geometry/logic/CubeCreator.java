package com.epam.geometry.logic;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.exceptions.ReadFileException;

import java.util.ArrayList;
import java.util.List;

public class CubeCreator {

    private static final Logger LOGGER = LogManager.getLogger(CubeCreator.class.getName());
    private DataParser dataParser;

    CubeCreator(DataParser dataParser) {
        this.dataParser = dataParser;
    }

    public List<Cube> createCubesFromFile(String filePath) {
        List<Cube> listOfCubes = new ArrayList<>();
        try {
            DataReader dataReader = new DataReader();
            List<String> linesFromFile = dataReader.readLines(filePath);

            listOfCubes = dataParser.parseCubes(linesFromFile);

            LOGGER.info("List of cubes was created.");
        } catch (ReadFileException e) {
            LOGGER.error(e);
        }
        return listOfCubes;
    }
}
