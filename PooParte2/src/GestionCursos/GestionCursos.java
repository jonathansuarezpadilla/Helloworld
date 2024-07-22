package GestionCursos;

import java.util.ArrayList;

public class GestionCursos {

    private ArrayList<Curso> cursos=new ArrayList<>();

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void agregarcurso(Curso c){
        this.cursos.add(c);
    }


    public void inscribirEstudiante(String idencurso,Estudiante estudiante){
        for (Curso c : cursos) {
            if(c.getNombreCurso().equals(idencurso)){
                c.getListaEstudiantes().add(estudiante);
            }
        }
    }

    public void listar(){
        cursos.forEach(c->{
            System.out.println("Nombre del curso: "+c.getNombreCurso());
            System.out.println("Estudiantes: ");
            c.getListaEstudiantes().forEach(l-> System.out.println(l.getNombre()));
        });
    }
}
