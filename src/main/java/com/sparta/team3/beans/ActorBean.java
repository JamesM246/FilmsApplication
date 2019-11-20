package com.sparta.team3.beans;

import com.sparta.team3.components.Actor;
import com.sparta.team3.services.WelcomeFilms;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ActorBean {

    @Inject
    private WelcomeFilms welcomeFilms = new WelcomeFilms();

    private Actor actor = new Actor();

    public Actor getActor(){
        return actor;
    }

//    public List<Actor> displayActors(String userInput){
//        if (userInput == null) {
//            return welcomeFilms.getActors();
//        } else {
//            return welcomeFilms.getActorsByFilm();
//        }
//    }
}
