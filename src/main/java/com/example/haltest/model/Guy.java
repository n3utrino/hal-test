package com.example.haltest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Guy {

    @Id
    public String id;
    public String name;



    @Override
    public String toString() {
        return name;
    }
}
