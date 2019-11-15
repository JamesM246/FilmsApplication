package com.sparta.team3.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Welcome {
    private String path;

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



}
