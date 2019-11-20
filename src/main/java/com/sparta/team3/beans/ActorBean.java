package com.sparta.team3.beans;

import com.sparta.team3.components.Actor;
import com.sparta.team3.services.FilmsService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ActorBean {

    @Inject
    private FilmsService filmsService = new FilmsService();

    private Actor actor = new Actor();

    public Actor getActor(){
        return actor;
    }

}
