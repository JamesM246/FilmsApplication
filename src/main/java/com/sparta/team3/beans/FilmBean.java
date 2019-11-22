package com.sparta.team3.beans;

import com.sparta.team3.components.Film;
import com.sparta.team3.services.FilmService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Named
@RequestScoped
public class FilmBean {

    @Inject
    private FilmService filmService;

    private List<Film> filmList;

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    public void displayFilms(String userInput){
        if (userInput.equals("")) {
            filmList = filmService.getFilmAll();
        } else {
            filmList = filmService.getFilmByActor(userInput);
        }
    }
}

