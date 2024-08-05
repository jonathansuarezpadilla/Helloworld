package org.example.Persistence.imodel;

import org.example.Entities.Avion;
import org.example.Persistence.crud.*;

import java.util.ArrayList;

public interface IAvionModel
        extends CreateModel<Avion>,
        DeleteModel<Integer>,
        ReadModel<Integer,Avion>,
        UpdateModel<Integer,Avion>{
}
