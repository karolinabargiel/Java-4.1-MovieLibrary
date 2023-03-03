package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class MovieLibrary {
    List<Movie> movies = new ArrayList<>();


    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }


    public List<Movie> getMoviesByDate() {
        System.out.println("Podaj rok początkowy: ");
        int fromYear = ScannerUtil.getDataFromUserInt();
        System.out.println("Podaj rok końcowy: ");
        int toYear = ScannerUtil.getDataFromUserInt();

        return movies.stream()
                .filter(m -> m.getDate() >= fromYear && m.getDate() <= toYear)
                .collect(Collectors.toList());
    }

    public Object getRandomMovie () {
        Random rand = new Random();
        List<Movie> list = getMovies();
        return list.get(rand.nextInt(list.size()));
    }

    public List<String> getMoviesByActor() {
        System.out.println("Podaj imię i nazwisko aktora: ");
        String actorName = ScannerUtil.getDataFromUserString();

        return movies.stream()
                .filter(movie -> movie.getActors().stream()
                        .anyMatch(a -> actorName.equals(a.getFirstName() + " " + a.getLastName())))
                .map(Movie::getTitle)
                .collect(Collectors.toList());
    }

}
