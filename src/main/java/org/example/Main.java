package org.example;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {
        MovieFilter movieFilter = new MovieFilter();
        DataHandler dataHandler = new DataHandler();
        dataHandler.chooseOption(movieFilter);

    }

}