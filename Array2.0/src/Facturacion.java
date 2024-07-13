import java.util.Scanner;

public class Facturacion {

    public static void main(String[] args) {

        String[] productos= {"mayonesa","mango","banano","cebolla","jabon"};
        System.out.println("Los productos disponibles son:");
        System.out.println(productos[0]+" "+productos[1]+" "+productos[2]+" "+productos[3]+" "+productos[4]);
        int[] precio= {7000,2000,600,1000,3000};

        Scanner sc= new Scanner(System.in);


        System.out.println("por favor ingresa la cantidad de los productos que deseas llevar");
        System.out.println("si no llevas el producto ingresa cero como cantidad");
        int[] cantidades=new int[productos.length];
        for (int i=0; i<productos.length; i++){
            System.out.println("ingrese una cantidad");
            int cantidad=sc.nextInt();
            cantidades[i]=cantidad;
        }
        int total=0;
        for(int k=0;k<cantidades.length;k++){
            total+=cantidades[k]*precio[k];
        }

        System.out.println("El valor total de su compra es: "+total);

    }


}
