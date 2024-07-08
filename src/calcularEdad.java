import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class calcularEdad {
    public static void main(String[] args) {

        //seccion para pedir fecha de nacimiento al usuario
        System.out.println(" por favor introduzca su fecha de nacimiento");
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su año de nacimiento");
        int age = sc.nextInt();
        System.out.println("ingrese su mes de nacimiento");
        int mes= sc.nextInt();
        System.out.println("ingrese su dia de nacimiento");
        int dia= sc.nextInt();
        double mes0=23;

        //sección para pedir fecha actual al usuario
        System.out.println("introduzca la fecha actual");
        System.out.println("ingrese el año actual");
        int year= sc.nextInt();
        System.out.println("ingrese el mes actual");
        int month= sc.nextInt();
        System.out.println("ingrese el dia actual");
        int day= sc.nextInt();
        double month0=0;

        //conversión de días a mes según el mes del año

        //conversión para los dias actuales a meses actuales
        if(1<=month && month<=7){

            if(month==2){
                month0=dia*(1.0/30);
            }

            if(month%2==0 && month!=2){

                month0=dia*(1.0/30);
            }
            else{
                month0=dia*(1.0/31);
            }
        }

        if(month>=8 && month<=12){
            if(month%2==0){
                month0=dia*(1.0/31);
            }
            else{
                month0=dia*(1.0/30);
            }
        }

        // conversión de los dias de nacimiento a mese de nacimiento
        if(1<=mes && mes<=7){

            if(mes==2){
                mes0=dia*(1.0/30);
            }

            if(mes%2==0 && mes!=2){

                mes0=dia*(1.0/30);
            }
            else{
                mes0=dia*(1.0/31);
            }
        }

        if(mes>=8 && mes<=12){
            if(mes%2==0){
                mes0=dia*(1.0/31);
            }
            else{
                mes0=dia*(1.0/30);
            }
        }

        double actual= (month0+month)*(1.0/12)+year; //obtención de años actuales y conversión de meses actuales a años actuales
        double mestotal=mes+mes0; //suma total de meses
        double total=mestotal*(1.0/12); //conversión de meses a año
        double edad=(actual-age-total);
        System.out.println("su edad es: "+edad);




        // solución dos

        /*

         LocalDate fechaActual=LocalDate.now();
        Scanner sc=new Scanner(System.in);
        System.out.println("introduzca su año de nacimiento");
        System.out.println("introduzca su mes de nacimiento");
        System.out.println("introduzca su dia de nacimiento");

        //proceso para formatear fecha actual con date().

        Date fechaactual= new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy"); // formateador
        String fechaFormateada = formateador.format(fechaActual);
        System.out.println("Fecha Formateada: " + fechaFormateada);



        LocalDate fecha1 = LocalDate.of(2024, 7, 7);
        LocalDate fecha2 = LocalDate.of(1999, 7, 7);
        Period diferencia=  Period.between(fecha2,fechaActual);
        System.out.println(diferencia.getYears()); // diferencia de fechas por año

         */
    }
}
