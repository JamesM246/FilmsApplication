package com.sparta.team3.services;

import com.sparta.team3.components.User;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Named
@Stateless
public class LoginService {
    @PersistenceContext
    private EntityManager entityManager;

    public String validateUser(User user) {
        try {
            Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.username = :username");
            query.setParameter("username",user.getUsername());
            User checkUser = (User)query.getSingleResult();
            if(user.getUsername().equals(checkUser.getUsername()) && user.getPassword().equals(checkUser.getPassword())) return "welcomeFilms";
            return "signIn";
        }catch(NoResultException e){
            return "signIn";
        }
    }
}
