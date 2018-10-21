package com.epam.geometry.logic;

//import org.apache.log4j.Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.epam.geometry.entities.Cube;
import com.epam.geometry.exceptions.ReadFileException;

import java.util.ArrayList;
import java.util.List;

public class Creator {

    private static final Logger LOGGER = LogManager.getLogger(Creator.class.getName());

    public List<Cube> createCubesFromFile(String filePath) {
        List<Cube> listOfCubes = new ArrayList<>();

        try {
            DataReader dataReader = new DataReader();
            List<String> linesFromFile = dataReader.readLines(filePath);

            DataParser dataParser = new DataParser(new Validator());

            listOfCubes = dataParser.parseCubes(linesFromFile);

            LOGGER.info("List of cubes was created.");
        } catch (ReadFileException e) {
            LOGGER.error(e);
        }
        return listOfCubes;
    }
}
