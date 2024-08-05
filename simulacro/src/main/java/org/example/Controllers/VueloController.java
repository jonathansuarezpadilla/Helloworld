package org.example.Controllers;

import org.example.Entities.Vuelo;
import org.example.Model.VueloModelImp;
import org.example.Persistence.imodel.IVueloModel;

import java.sql.Date;
import java.sql.Time;

public class VueloController {


    IVueloModel vueloModel= new VueloModelImp();


    public Vuelo create(Vuelo request) {
        return this.vueloModel.create(request);
    }

    public Vuelo readModel(String destino){
        return this.vueloModel.readById(destino);
    }

    public void update(int id_vuelo,Vuelo request) {
        this.vueloModel.update(id_vuelo,request);
    }

}
