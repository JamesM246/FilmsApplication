package com.sparta.team3.beans;

import com.sparta.team3.components.Actor;
import com.sparta.team3.components.Film;
import com.sparta.team3.databaseManipulation.DAO;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class FilmBean {

    @Inject
    private DAO dao;

    private Film film = new Film();

    public Film getActor(){
        return film;
    }

    private String displayFilms(){

    }

    private String displayFilmsByActor(){

    }

}

