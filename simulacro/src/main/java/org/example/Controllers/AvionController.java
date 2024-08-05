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


    public void update(Integer id, Avion request){
        this.AvionModel.update(id, request);
    }


    public void delete(int id){
        this.AvionModel.delete(id);
    }
}
