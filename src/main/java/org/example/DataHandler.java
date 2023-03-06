package org.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;


public class DataHandler {
    MovieLibrary listMovieLibrary = new ObjectMapper().readValue(new File("src/movies.json"), MovieLibrary.class);

    public DataHandler() throws IOException {
    }

    public void printMenu() {
        System.out.println("""
                ***************
                Choose action:
                1 - Provide two dates to display movie titles from this range
                2 – Display all data about one of the random the movie
                3 – Provide fist name and last name of actor to see movie
                4 - Close program
                ***************""");
    }

    public void chooseOption(MovieFilter movieFilter) {
        while (true) {
            printMenu();
            switch (ScannerUtil.getIntFromUser()) {
                case 1 -> System.out.println(movieFilter.getMoviesByDate(listMovieLibrary));
                case 2 -> System.out.println(movieFilter.getRandomMovie(listMovieLibrary));
                case 3 -> System.out.println(movieFilter.getMoviesByActor(listMovieLibrary));
                case 4 -> System.exit(0);
                default -> System.out.println("Avaliable values: 1, 2, 3, 4");
            }

        }
    }


}
