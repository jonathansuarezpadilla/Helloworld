import javax.swing.*;
import java.util.Scanner;

public class CuentaBancaria {

    String titular;
    double deposito;
    double balance;
    double count;

    public void dinero(double deposito){
        this.count = this.deposito;
        this.deposito += deposito;

    }



    double balance(){
        return this.balance=this.deposito;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CuentaBancaria cb = new CuentaBancaria();
        while(true){
            System.out.println("Porfavor introduza lo que desea hacer");
            System.out.println("1. Retirar\n2. depositar");
            int numero=sc.nextInt();
            if(numero==1){

                double retiro=-1*Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a retirar"));
                if(retiro*-1>cb.deposito){
                    System.out.println("La cantidad que deseas retirar es superior al dinero que tienes en la cuenta");
                }
                else{
                    cb.dinero(retiro);
                    System.out.println("Saldo anterior: "+cb.count);
                    System.out.println("Saldo actual: "+cb.balance());
                }

            }
            if(numero==2){
                double deposito=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor a depositar"));

                cb.dinero(deposito);
                System.out.println("Saldo anterior: "+cb.count);
                System.out.println("Saldo actual: "+cb.balance());

            }

            System.out.println("¿Deseas salir o continuar? introduce (S/N)");
            String opcion=sc.next().toUpperCase();
            if(opcion.equals("S")){
                break;
            }

        }
    }


}
