package org.example;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String title;
    private String genre;
    private int date;
    private Director director;
    List<Actor> actors = new ArrayList<>();


    public String getTitle() {
        return title;
    }


    public int getDate() {
        return date;
    }


    public List<Actor> getActors() {
        return actors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "\n" + "title: " + title + "\n" +
                " genre: " + genre + "\n" +
                " date: " + date + "\n" +
                " director: " + director + "\n" +
                " actors: " + actors;
    }

}
