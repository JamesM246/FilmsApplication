package com.sparta.team3.services;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class FilmActorService {

    @Inject
    private ActorBean actorBean;
    @Inject
    private FilmBean filmBean;

    private List<Object> getActorList(String userInput){
        if(userInput == null){
            return actorBean.displayActors();
        }else{
            return actorBean.displaySelectActors();
        }
    }

    private List<Object> getFilmList(String userInput){
        if(userInput == null){
            return filmBean.displayFilms();
        }else{
            return filmBean.displaySelectFilms();
        }
    }
}
