import java.util.ArrayList;

public class Calificaciones {
    String nombre;
    ArrayList<Double> listaCalificaciones;


    public void agregarCalificaciones(double calificacion){
        listaCalificaciones = new ArrayList<>();
        listaCalificaciones.add(calificacion);
    }
}
