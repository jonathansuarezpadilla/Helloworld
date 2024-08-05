package org.example.Controllers;

import org.example.Entities.Pasajero;
import org.example.Model.PasajeroModelImpl;
import org.example.Persistence.imodel.IPasajeroModel;

public class PasajeroController {

    // instanciando la interfaz de convergencia de Pasajeros

    IPasajeroModel pasajeroModel= new PasajeroModelImpl();

    public Pasajero create(Pasajero request){
        return this.pasajeroModel.create(request);
    }


    public Pasajero readModel(String name){
        return this.pasajeroModel.readById(name);
    }


    public void update(int id, Pasajero request){
        this.pasajeroModel.update(id,request);
    }
}
