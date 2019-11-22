package com.sparta.team3.services;


import com.sparta.team3.components.Actor;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


@PersistenceContext
public class ActorService {

    EntityManager entityManager;


    public List<Actor> getAllActors(){
        List<Actor> actors;
        Query query = entityManager.createNamedQuery("getAll");
        actors = (List<Actor>) query.getResultList();
        return actors;
    }


    public List<Actor> getActorsInFilm(){
        List<Actor> getActorsInFilm;
        Query query = entityManager.createNamedQuery("getActorsInFilm");
        getActorsInFilm = (List<Actor>) query.getResultList();
        return getActorsInFilm;

    }

}
