package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        MovieLibrary listMovieLibrary = new ObjectMapper().readValue(new File("src/movies.json"), MovieLibrary.class);
        //wywołanie opcji 1
        //System.out.println(listMovieLibrary.getMoviesByDate().toString());
        //wywołanie opcji 2
        //System.out.println(listMovieLibrary.getRandomMovie());
        //wywołanie opcji 3
        System.out.println(listMovieLibrary.getMoviesByActor());

    }



}