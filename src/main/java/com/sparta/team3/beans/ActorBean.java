package com.sparta.team3.beans;

import com.sparta.team3.components.Actor;
import com.sparta.team3.components.Film;
import com.sparta.team3.services.FilmService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ActorBean {

    @Inject
    private FilmService filmService;

    private List<Actor> actorList;

    public List<Actor> getFilmList() {
        return actorList;
    }

    public void setFilmList(List<Film> filmList) {
        this.actorList = actorList;
    }

    public void displayActors(String userInput){
        if (userInput.equals("")) {
            //actorList = filmService.getFilmAll();
        } else {
            //actorList = filmService.getFilmByActor(userInput);
        }
    }
}
