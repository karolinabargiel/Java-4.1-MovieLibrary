package org.example;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MovieFilter {

    public List<Movie> getMoviesByDate(MovieLibrary movieLibrary) {
        List<Movie> movies = movieLibrary.getMovies();
        System.out.println("Provide year from: ");
        int fromYear = ScannerUtil.getIntFromUser();
        System.out.println("Provide year to: ");
        int toYear = ScannerUtil.getIntFromUser();

        return movies.stream()
                .filter(m -> m.getDate() >= fromYear && m.getDate() <= toYear)
                .collect(Collectors.toList());
    }

    public Object getRandomMovie(MovieLibrary movieLibrary) {
        List<Movie> movies = movieLibrary.getMovies();
        Random rand = new Random();
        return movies.get(rand.nextInt(movies.size()));
    }

    public List<String> getMoviesByActor(MovieLibrary movieLibrary) {
        List<Movie> movies = movieLibrary.getMovies();
        System.out.println("Provide actor's first and last name: ");
        String actorName = ScannerUtil.getStringFromUser();

        return movies.stream()
                .filter(movie -> movie.getActors().stream()
                        .anyMatch(a -> actorName.equals(a.getFirstName() + " " + a.getLastName())))
                .map(Movie::getTitle)
                .collect(Collectors.toList());
    }

}
