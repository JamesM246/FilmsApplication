package com.sparta.team3.services;

import com.sparta.team3.components.Actor;
import com.sparta.team3.components.Film;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
@Named
public class WelcomeFilms {

    @PersistenceContext
    private EntityManager entityManager;

    private List<Actor> listOfActors;
    private List<Actor> listActorsByFilm;

    private List<Film> listFilmsByActor;
    private List<Film> listOfFilms;

    public List<Actor> getActors() {
        try {
            Query query = entityManager.createNativeQuery("Actor.findAllActors");
            listOfActors = (List<Actor>) query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listOfActors;
    }

    public List<Film> getFilms() {
        try {
            Query query = entityManager.createNativeQuery("Film.findAllFilms");
            listOfFilms = (List<Film>) query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listOfFilms;
    }

    public List<Film> getFilmsByActor() {
        try {
            Query query = entityManager.createNativeQuery("Actor.findFilmsByActor");
            listFilmsByActor = (List<Film>) query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listFilmsByActor;
    }

    public List<Actor> getActorsByFilm() {
        try {
            Query query = entityManager.createNativeQuery("Actor.findActorByFilm");
            listActorsByFilm = (List<Actor>) query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listActorsByFilm;
    }
}
