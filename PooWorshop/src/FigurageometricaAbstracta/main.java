package FigurageometricaAbstracta;

public class main {

    public static void main(String[] args) {


        FiguraAbstractaGeometrica figura1 = new Circulo(5.0);
        FiguraAbstractaGeometrica figura2 = new Rectangulo(4.0, 3.0);
        FiguraAbstractaGeometrica figura3 = new Cuadrado(6.0);
        System.out.println("Área del círculo: " + figura1.calcularArea());
        System.out.println("Área del rectángulo: " + figura2.calcularArea());
        System.out.println("Área del cuadrado: " + figura3.calcularArea());
    }
}
