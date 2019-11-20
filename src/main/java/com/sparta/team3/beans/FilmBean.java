package com.sparta.team3.beans;

import com.sparta.team3.components.Film;
import com.sparta.team3.services.FilmsService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class FilmBean {

    @Inject
    private FilmsService filmsService = new FilmsService();

    private Film film = new Film();

    public Film getFilm(){
        return film;
    }

}

