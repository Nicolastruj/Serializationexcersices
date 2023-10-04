package org.ulpgc.dacd.model;

public class Session {
    private Movie movie;
    private Theater theater;

    public Session(Movie film, Theater theater) {
        this.movie = film;
        this.theater = theater;
    }
}
