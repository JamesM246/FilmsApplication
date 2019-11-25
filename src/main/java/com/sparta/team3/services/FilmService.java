package com.sparta.team3.services;

import com.sparta.team3.components.Actor;
import com.sparta.team3.components.Film;
import com.sparta.team3.components.User;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Named
public class FilmService {

    @PersistenceContext
    EntityManager entityManager;

    public List<Film> getFilmAll(){
        List<Film> filmList = new ArrayList<>();
        try {
            Query query = entityManager.createNamedQuery("AllFilms");
            filmList = query.getResultList();
        }catch(NoResultException e){
            e.printStackTrace();
        }
        return filmList;
    }

    public List<Film> getFilmByActor(String userInput){
        List<Film> filmList = new ArrayList<>();
        try {
            Query query = entityManager.createNativeQuery("FilmByActor");
            query.setParameter(1, userInput);
            filmList = query.getResultList();
        }catch(NoResultException e){
            e.printStackTrace();
        }
        return filmList;
    }

    public List<Actor> getAllActors(String userInput){
        List<Actor> actorList = new ArrayList<>();
        try{
            Query query = entityManager.createNamedQuery("AllActors");
            actorList = query.getResultList();
        } catch(NoResultException e){
            e.printStackTrace();
        }
        return actorList;
    }

    public List<Film> getActorByFilm(String userInput){
        List<Film> filmList = new ArrayList<>();
        try {
            Query query = entityManager.createNativeQuery("ActorByFilm");
            query.setParameter(1, userInput);
            filmList = query.getResultList();
        }catch(NoResultException e){
            e.printStackTrace();
        }
        return filmList;
    }
}
