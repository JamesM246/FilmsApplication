package com.sparta.team3.components;

import javax.persistence.*;

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @Column(name = "actor_id")
    private String actorId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

//    public Actor(){
//
//    }
//
//    public Actor(String actorId, String firstName, String lastName){
//        this.actorId = actorId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }

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

//    @ManyToMany
//    @JoinTable(
//            name = "film_actor",
//            joinColumns = @JoinColumn(name = "actor_id"),
//            inverseForeignKey = @JoinColumn(name = "film_id"),
//    )
//    private List<Film> films;

}









