package com.sparta.team3.components;

import javax.inject.Named;
import javax.persistence.*;

@Named
@Entity
@Table(name = "film")
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

//    @ManyToMany(mappedBy = "films")
//    private List<Actor> actors;
}
