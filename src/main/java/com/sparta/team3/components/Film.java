package com.sparta.team3.components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Film {
    @Id
    @Column(name = "film_id")
    private int filmId;
    @Column(name = "title")
    private int filmTitle;

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public int getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(int filmTitle) {
        this.filmTitle = filmTitle;
    }

}
