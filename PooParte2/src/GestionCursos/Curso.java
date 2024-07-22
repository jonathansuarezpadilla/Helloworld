package GestionCursos;

import java.util.ArrayList;

public class Curso  {
    private int codigo;
    private String nombreCurso;
    private ArrayList<Estudiante> listaEstudiantes;

    public Curso(int codigo, String nombreCurso, ArrayList<Estudiante> listaEstudiantes) {
        this.codigo = codigo;
        this.nombreCurso = nombreCurso;
        this.listaEstudiantes = listaEstudiantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
}
