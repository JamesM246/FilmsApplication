package com.sparta.team3.beans;

import com.sparta.team3.components.Actor;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ActorBean {

    @Inject
    private FilmService filmService;

    private Actor actor = new Actor();

    public Actor getActor(){
        return actor;
    }

    private String displayActors(){
        return filmService.displayAllActors();
    }

    private String displayFilmsByActor(){
        return filmService.displayActorFilms(actor);
    }


}
