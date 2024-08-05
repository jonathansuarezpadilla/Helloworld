package org.example.Persistence.imodel;

import org.example.Entities.Avion;
import org.example.Entities.Pasajero;
import org.example.Persistence.crud.CreateModel;
import org.example.Persistence.crud.ReadModel;
import org.example.Persistence.crud.UpdateModel;

public interface IPasajeroModel extends
        CreateModel<Pasajero>, ReadModel<String,Pasajero>, UpdateModel<Integer,Pasajero>{
}
