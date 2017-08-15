package com.example.haltest;

import com.example.haltest.model.Guy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "guys", itemResourceRel = "guy")
public interface GuyRepository extends CrudRepository<Guy, String> {


    List<Guy> findByName(String name);

}
