package com.sparta.team3.components;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "actor")
@NamedNativeQueries({
        @NamedNativeQuery(name = "Actor.findAllActors",
                query = "SELECT first_name, last_name FROM actor"),
        @NamedNativeQuery(name = "Actor.findFilmsByActor",
                query = "SELECT film.title FROM film_actor \n" +
                        "JOIN actor ON film_actor.actor_id = actor.actor_id \n" +
                        "JOIN film on film_actor.film_id = film.film_id \n" +
                        "WHERE actor.actor_id = ?"),
})
public class Actor {
    @Id
    @Column(name = "actor_id")
    private String actorId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public String getActorId() {
        return actorId;
    }

    public void setActorId(String actorId) {
        this.actorId = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ManyToMany
    @JoinTable(
            name = "film_actor",
            joinColumns = @JoinColumn(name = "actor_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    private List<Film> films;

}









