package com.sparta.team3.components;

import javax.inject.Named;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "film")

@NamedQueries({
        @NamedQuery(name = "FilmAll", query = "SELECT f FROM Film f")
})

@NamedNativeQuery(name = "FilmByActor", query = "SELECT film.film_id, film.title FROM film JOIN film_actor ON film.film_id=film_actor.film_id WHERE film_actor.actor_id = ?")

public class Film {
    @Id
    @Column(name = "film_id")
    private int filmId;
    @Column(name = "title")
    private String filmTitle;

//    @ManyToMany(mappedBy = "films")
//    private List<Actor> actors;

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
