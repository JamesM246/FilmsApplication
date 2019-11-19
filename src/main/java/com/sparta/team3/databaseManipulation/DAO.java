package com.sparta.team3.databaseManipulation;

import com.sparta.team3.components.Actor;
import com.sparta.team3.components.Film;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


public class DAO {

    @PersistenceContext
    EntityManager entityManager;
    HttpServletRequest request;

    private String getActors = "SELECT actor_id, first_name, last_name FROM actor";

    private String getFilms = "SELECT film_id, title FROM film";

    private String filmByActor = "SELECT film.film_id, film.title FROM film_actor " +
            "JOIN actor ON film_actor.actor_id = actor.actor_id " +
            "JOIN film on film_actor.film_id = film.film_id " +
            "WHERE actor.actor_id = ";

    private String actorsByFilm = "SELECT actor.actor_id, first_name, last_name FROM film_actor " +
            "JOIN actor ON film_actor.actor_id = actor.actor_id " +
            "JOIN film on film_actor.film_id = film.film_id " +
            "WHERE film.film_id = ";

    private List<Actor> listOfActors;
    private List<Actor> listActorsByFilm;

    private List<Film> listFilmsByActor;
    private List<Film> listOfFilms;

    public List getActors() {
        try {
            Query query = entityManager.createNativeQuery(getActors);
            listOfActors = (List<Actor>) query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listOfActors;
    }

    public List getFilms() {
        try {
            Query query = entityManager.createNativeQuery(getFilms);
            listOfFilms = (List<Film>) query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listOfFilms;
    }

    public List getFilmsByActor(String userInput) {
        try {
            Query query = entityManager.createNativeQuery(filmByActor + userInput);
            listFilmsByActor = (List<Film>) query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listFilmsByActor;
    }

    public List getActorsByFilm(String userInput) {
        try {
            Query query = entityManager.createNativeQuery(actorsByFilm + userInput);
            listActorsByFilm = (List<Actor>) query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listActorsByFilm;
    }

}