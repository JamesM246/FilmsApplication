package com.sparta.team3.services;

import com.sparta.team3.beans.ActorBean;
import com.sparta.team3.beans.FilmBean;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class WelcomeFilms {

    @Inject
    private ActorBean actorBean;
    @Inject
    private FilmBean filmBean;

    private List<Object> objectList;
    private String radioOption;
    private String userInput;


    protected String getList(){
        if(radioOption.equals("1")) {
            objectList = actorBean.displayActors(userInput);
        }else {
            objectList = filmBean.displayFilms(userInput);
        }
    }
}
