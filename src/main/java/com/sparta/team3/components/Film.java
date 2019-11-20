package com.sparta.team3.components;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "film")
@NamedNativeQueries({
        @NamedNativeQuery(name="Film.findAllFilms",
                query="SELECT first_name, last_name FROM film"),
        @NamedNativeQuery(name="Actor.findActorByFilm",
                query="SELECT first_name, last_name FROM film_actor \n"
                        + "JOIN actor ON film_actor.actor_id = actor.actor_id \n"
                        + "JOIN film on film_actor.film_id = film.film_id \n"
                        + "WHERE film.film_id = ?"),
})
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

    @ManyToMany(mappedBy = "films")
    private List<Actor> actors;
}
