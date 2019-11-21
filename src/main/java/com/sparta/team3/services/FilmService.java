package com.sparta.team3.services;

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
            Query query = entityManager.createNamedQuery("FilmAll");
            filmList = query.getResultList();
        }catch(NoResultException e){
            e.printStackTrace();
        }
        return filmList;
    }

    public List<Film> getFilmByActor(String userInput){
        List<Film> filmList = new ArrayList<>();
        try {
            Query query = entityManager.createNamedQuery("FilmByActor");
            query.setParameter("actorId", userInput);
            filmList = query.getResultList();
        }catch(NoResultException e){
            e.printStackTrace();
        }
        return filmList;
    }
}
