package com.sparta.team3.services;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@Named
public class ActorService {

    @PersistenceContext
    EntityManager entityManager;


}
