package com.sparta.team3.services;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class WelcomeFilms {

    @Inject
    private ActorBean actorBean;
    @Inject
    private FilmBean filmBean;

    private String radioOption;
    private String userInput;

    private String getList(){
        if(radioOption.equals("1")) {
            if (userInput == null) {
                return actorBean.displayActors();
            } else {
                return actorBean.displaySelectActors(userInput);
            }
        }else {
            if (userInput == null) {
                return filmBean.displayFilms();
            } else {
                return filmBean.displaySelectFilms(userInput);
            }
        }
    }
}
