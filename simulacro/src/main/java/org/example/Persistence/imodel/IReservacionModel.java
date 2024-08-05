package org.example.Persistence.imodel;

import org.example.Entities.Avion;
import org.example.Entities.Reservacion;
import org.example.Persistence.crud.CreateModel;
import org.example.Persistence.crud.ReadAllModel;
import org.example.Persistence.crud.ReadModel;
import org.example.Persistence.crud.UpdateModel;

import java.util.ArrayList;

public interface IReservacionModel extends
        CreateModel<Reservacion>, ReadAllModel<ArrayList<Reservacion>,Integer>,
        UpdateModel<Integer,Reservacion>{


}
