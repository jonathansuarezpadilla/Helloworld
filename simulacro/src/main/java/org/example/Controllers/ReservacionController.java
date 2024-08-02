package org.example.Controllers;

import org.example.Entities.Avion;
import org.example.Entities.Pasajero;
import org.example.Entities.Reservacion;
import org.example.Model.ReservacionModelImp;
import org.example.Persistence.imodel.IReservacionModel;

import java.util.ArrayList;

public class ReservacionController {


    IReservacionModel reservacion=new ReservacionModelImp();


    public Reservacion create(Reservacion request){
        return this.reservacion.create(request);
    }


    public ArrayList<Reservacion> readall(int id){
        return this.reservacion.readAll(id);
    }
}
