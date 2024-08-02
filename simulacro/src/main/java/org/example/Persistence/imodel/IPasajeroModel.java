package org.example.Persistence.imodel;

import org.example.Entities.Avion;
import org.example.Entities.Pasajero;
import org.example.Persistence.crud.CreateModel;
import org.example.Persistence.crud.ReadModel;

public interface IPasajeroModel extends
        CreateModel<Pasajero>, ReadModel<String,Pasajero>{
}
