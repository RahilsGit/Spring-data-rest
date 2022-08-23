package com.telusko.demo;

import com.telusko.demo.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "aliens", path="aliens") //this aliens word will be used to map..
// E.g. if you are sendind request from postman so we have to use this aliens word there.
public interface AlienRepo extends JpaRepository<Alien, Integer> {


}
