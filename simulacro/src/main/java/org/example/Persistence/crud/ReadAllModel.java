package org.example.Persistence.crud;

public interface ReadAllModel<entity,ID> {
    public entity readAll(ID id);


}
