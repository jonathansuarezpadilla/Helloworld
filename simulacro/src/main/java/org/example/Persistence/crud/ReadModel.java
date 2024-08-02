package org.example.Persistence.crud;

import org.example.Entities.Avion;

public interface ReadModel<ID,entity>{
    public entity readById(ID id);
}
