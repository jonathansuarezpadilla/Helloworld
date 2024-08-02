package org.example.Controllers;

import org.example.Entities.Avion;
import org.example.Model.AvionModelImpl;
import org.example.Persistence.imodel.IAvionModel;

import java.util.ArrayList;

public class AvionController {


    IAvionModel AvionModel= new AvionModelImpl(); // para que se instancia el modelo?

    public Avion create(Avion request){
        return this.AvionModel.create(request);
    }

    public Avion readById(int ID){
        return this.AvionModel.readById(ID);
    }


    public void update(int id, String modelo,int capacidad){
        this.AvionModel.update(id, modelo, capacidad);
    }
}
