package com.sparta.team3.beans;

import com.sparta.team3.components.Film;
import com.sparta.team3.services.WelcomeFilms;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class FilmBean {

    @Inject
    private WelcomeFilms welcomeFilms = new WelcomeFilms();

    private Film film = new Film();

    public Film getFilm(){
        return film;
    }

    public List<Film> displayFilms(String userInput){
        if (userInput == null) {
            return welcomeFilms.getFilms();
        } else {
            return welcomeFilms.getFilmsByActor();
        }
    }
}

