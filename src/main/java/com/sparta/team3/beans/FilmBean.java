package com.sparta.team3.beans;

import com.sparta.team3.components.Film;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class FilmBean {

    @Inject
    private FilmService filmService;

    private Film film = new Film();

    private Film getFilm(){
        return film;
    }

    private String displayFilms(){
        return filmService.displayAllFilms();
    }

    private String displaySelectFilms(){
        return filmService.displaySelectFilms();
    }





}


//1List all actors - and show films that the selected actor has been inq
//        2List all filsm
//        3
//        4