package com.sparta.team3.components;

import javax.inject.Named;
import javax.persistence.*;
import java.util.List;

@Named
@Entity
@Table(name = "actor")
@NamedQueries({
        @NamedQuery(name = "getAll", query = "SELECT a.actorId, a.firstName, a.lastName FROM Actor a"),
        @NamedQuery(name = "getActorsInFilm", query = "SELECT a.actorId, a.firstName, a.lastName FROM Actor a JOIN Film f WHERE f.filmId =: filmId")
}
)
public class Actor {

    @Id
    @Column(name = "actor_id")
    private String actorId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public Actor(){

    }

    public Actor(String actorId, String firstName, String lastName){
        this.actorId = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

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
//    @OneToMany
    private List<Film> films;

}









