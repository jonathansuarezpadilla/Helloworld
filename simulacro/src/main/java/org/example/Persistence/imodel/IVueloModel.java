package org.example.Persistence.imodel;

import org.example.Entities.Avion;
import org.example.Entities.Vuelo;
import org.example.Persistence.crud.CreateModel;
import org.example.Persistence.crud.ReadModel;
import org.example.Persistence.crud.UpdateModel;

public interface IVueloModel extends
        CreateModel<Vuelo>,
        ReadModel<String,Vuelo>, UpdateModel {
}
