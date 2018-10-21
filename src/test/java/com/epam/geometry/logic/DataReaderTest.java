package com.epam.geometry.logic;

import com.epam.geometry.exceptions.ReadFileException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataReaderTest {
    private static final String FILE_PATH = "src/test/resources/cubesWithCorrectLines.txt";
    private static final String FIRST_LINE = "5 1.0 1.0 1.0";
    private static final String SECOND_LINE = "6 2.0 2.0 2.0";

    @Test
    public void shouldReturnLinesFromFileWhenFileIsExist() throws ReadFileException {
        // given
        DataReader dataReader = new DataReader();
        
        List<String> exampleTestArrayList = new ArrayList<>();
        exampleTestArrayList.add(FIRST_LINE);
        exampleTestArrayList.add(SECOND_LINE);

        // when
        List<String> listOfStrings = dataReader.readLines(FILE_PATH);

        // then
        Assert.assertEquals(exampleTestArrayList, listOfStrings);
    }
}