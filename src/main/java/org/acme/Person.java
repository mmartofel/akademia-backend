package org.acme;

import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Person extends PanacheEntity {

    @Column (length = 20)
    private String name;

    @Column (length = 50)
    private String surname;
    
}
