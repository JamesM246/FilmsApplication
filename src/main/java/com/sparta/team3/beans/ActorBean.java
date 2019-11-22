package com.sparta.team3.beans;

import com.sparta.team3.components.Actor;
import com.sparta.team3.databaseManipulation.DAO;
import com.sparta.team3.services.ActorService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ActorBean {

    ActorService actorService = new ActorService();
    @Inject
    public List<Actor> displayActors(String userInput){

        if (userInput.equals("")) {
            return actorService.getAllActors();
        } else {
            return actorService.getActorsInFilm();
        }
    }
}
