package org.example.Persistence.crud;

public interface CreateModel <entity>{
    public entity create (entity request); //¿que es el request?
}


// genericos: evitamos casteos