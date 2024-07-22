package GestionCursos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionCursos gestion=new GestionCursos();

        while(true){

            System.out.println("Porfavor Ingresa lo que desea hacer:\n1. Agregar curso\n2.inscribir estudiantes en un curso\n3. listar estudiantes de un curso");
            int numero=sc.nextInt();

            if(numero==1){

                int codigo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codico del curso"));
                String nombreCurso=JOptionPane.showInputDialog("Introduce el nombre del curso");
                ArrayList<Estudiante> nuevosEstudiantes = new ArrayList<>();
                Curso materia=new Curso(codigo,nombreCurso,nuevosEstudiantes);


                System.out.println("¿Deseas inscribir estudiantes en un curso? (introduce: S/N)");
                String inscripcion=sc.next().toLowerCase();
                if(inscripcion.equals("s")){
                    String nombre= JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
                    int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del estudiante"));
                    String email=JOptionPane.showInputDialog("Ingrese el email del estudiente");
                    Estudiante estudiante= new Estudiante(nombre,id,email);
                    materia.getListaEstudiantes().add(estudiante);
                    gestion.agregarcurso(materia);
                }
                else{
                    gestion.agregarcurso(materia);
                }
            }


            else if(numero==2){
                String idencurso=JOptionPane.showInputDialog("Ingrese el nombre del curso");
                AtomicBoolean vari= new AtomicBoolean(false);
                gestion.getCursos().forEach(e->{
                    if(e.getNombreCurso().equals(idencurso)){
                        vari.set(true);
                        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
                        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del estudiante"));
                        String email=JOptionPane.showInputDialog("Ingrese el email del estudiente");
                        Estudiante estudiante= new Estudiante(nombre,id,email);
                        gestion.inscribirEstudiante(idencurso,estudiante);
                    }


                });
                if(!vari.get()){
                    System.out.println("No existe el curso");
                }

            }
            else{
                gestion.listar();
            }




        }
    }
}
