import java.util.Scanner;

public class calcularEdad {
    public static void main(String[] args) {
        System.out.println(" por favor introduzca su fecha de nacimiento");
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su año de nacimiento");
        int age = sc.nextInt();
        System.out.println("ingrese su mes de nacimiento");
        int mes= sc.nextInt();
        System.out.println("ingrese su dia de nacimiento");
        int dia= sc.nextInt();
        int mes0=2;

        if(1<=mes && mes<=7){

            if(mes==2){
                mes0=dia*(mes/30);
            }

            if(mes%2==0 && mes!=2){

                mes0=dia*(mes/30);
            }
            else{
                mes0=dia*(mes/31);
            }
        }

        if(mes>=8 && mes<=12){
            if(mes%2==0 && mes!=2){

                mes0=dia*(mes/31);
            }
            else{
                mes0=dia*(mes/30);
            }
        }

        int mestotal=mes+mes0;
        int total=(mestotal+mes)*(1/12);

        System.out.println(total);
        int edad=Math.round(2024-age-total);
        System.out.println("su edad es: "+edad);
    }
}
