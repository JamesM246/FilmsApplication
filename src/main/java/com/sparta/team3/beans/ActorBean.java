package com.sparta.team3.beans;

import com.sparta.team3.components.Actor;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ActorBean {

    @Inject
    private DAO dao;

    public List<Object> displayActors(String userInput){

        if (userInput == null) {
            return dao.getActors();
        } else {
            return dao.getActorsByFilm(userInput);
        }
    }
}
