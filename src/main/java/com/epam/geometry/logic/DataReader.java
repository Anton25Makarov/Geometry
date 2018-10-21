package com.epam.geometry.logic;

import com.epam.geometry.exceptions.ReadFileException;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {

    public List<String> readLines(String filePath) throws ReadFileException {

        List<String> stringList = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(filePath), "UTF-8")) {
            while (scanner.hasNextLine()) {
                stringList.add(scanner.nextLine());
            }
        } catch (NoSuchFileException e) {
            throw new ReadFileException("Can not find file", e);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return stringList;
    }
}
