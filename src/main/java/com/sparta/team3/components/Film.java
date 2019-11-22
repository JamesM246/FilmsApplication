package com.sparta.team3.components;

import javax.inject.Named;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "film")
@NamedQueries({
        @NamedQuery(name = "FilmAll", query = "SELECT f FROM Film f"),
        @NamedQuery(name = "FilmByActor", query = "SELECT f.filmId, f.filmTitle FROM Film f JOIN f.actors a WHERE a.actorId = :actorId")
})

public class Film {
    @Id
    @Column(name = "film_id")
    private int filmId;
    @Column(name = "title")
    private String filmTitle;

    @ManyToMany(mappedBy = "films")
    private List<Actor> actors;

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }
}
