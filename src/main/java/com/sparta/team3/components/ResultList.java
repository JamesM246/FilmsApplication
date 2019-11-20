package com.sparta.team3.components;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class ResultList implements Serializable {

    private List<Object> list;

    private List<Actor> testList = new ArrayList<>();

    {
        testList.add(new Actor("1","James","Maguire"));
    }


    public List<Object> getList() {
        return list;
    }

//    public List<Actor> getListAsActor() {
//        return (List<Actor>) (Object) list;
//    }
    public List<Actor> getListAsActor() {
        return testList;
    }

    public List<Film> getListAsFilm() {
        return (List<Film>) (Object) list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

}
