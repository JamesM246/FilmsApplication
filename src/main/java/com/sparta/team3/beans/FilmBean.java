package com.sparta.team3.beans;

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

    public List<Object> displayFilms(String userInput){

        if (userInput.equals("")) {
            return dao.getFilms();
        } else {
            return dao.getFilmsByActor(userInput);
        }
    }
}

