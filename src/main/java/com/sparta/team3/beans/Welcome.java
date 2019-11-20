package com.sparta.team3.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class Welcome {
    private String path;

    @Inject
    private ActorBean actorBean;
    @Inject
    private FilmBean filmBean;

    private List<Object> objectList;
    private String radioOption;
    private String userInput;

    public ActorBean getActorBean() {
        return actorBean;
    }

    public void setActorBean(ActorBean actorBean) {
        this.actorBean = actorBean;
    }

    public FilmBean getFilmBean() {
        return filmBean;
    }

    public void setFilmBean(FilmBean filmBean) {
        this.filmBean = filmBean;
    }

    public List<Object> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public String getRadioOption() {
        return radioOption;
    }

    public void setRadioOption(String radioOption) {
        this.radioOption = radioOption;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String nextScreen(){
        if(path == null) return "signIn";
        return (path.equals("1")) ? "register" : "login";
    }

    public String getList(){
        if(radioOption.equals("1")){
            objectList = actorBean.displayActors(userInput);
            return "listActors";
        }else{
            objectList = filmBean.displayFilms(userInput);
            return "filmList";
        }
    }

}
