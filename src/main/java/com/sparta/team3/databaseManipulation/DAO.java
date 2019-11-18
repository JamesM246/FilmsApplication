package com.sparta.team3.databaseManipulation;

import com.sparta.team3.components.Actor;
import com.sparta.team3.components.Film;
import com.sparta.team3.components.User;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.List;


public class DAO {

    @PersistenceContext
    EntityManager entityManager;
    HttpServletRequest request;

    Actor actor = new Actor();

    private final String input = request.getParameter("getIdQuery");


    private String getActors = "SELECT first_name, last_name FROM actor";
    private String getFilms = "SELECT first_name, last_name FROM film";


    private String filmByActor = "SELECT film.title FROM film_actor \n" +
            "JOIN actor ON film_actor.actor_id = actor.actor_id \n" +
            "JOIN film on film_actor.film_id = film.film_id \n" +
            "WHERE actor.actor_id = "+ input;

    private String actorsByFilm = "SELECT first_name, last_name FROM film_actor \n" +
            "JOIN actor ON film_actor.actor_id = actor.actor_id \n" +
            "JOIN film on film_actor.film_id = film.film_id \n" +
            "WHERE film.film_id = " + input;



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



    public List getFilmsByActor() {
        try {
            Query query = entityManager.createNativeQuery(filmByActor);
            listFilmsByActor = (List<Film>) query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listFilmsByActor;
    }



    public List getActorsByFilm() {
        try {
            Query query = entityManager.createNativeQuery(getFilms);
            listActorsByFilm = (List<Actor>) query.getResultList();
        } catch (NoResultException e) {
            e.printStackTrace();
            e.getMessage();
        }
        return listActorsByFilm;
    }


}
