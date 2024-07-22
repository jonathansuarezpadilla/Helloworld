package FigurageometricaAbstracta;

public class Rectangulo extends FiguraAbstractaGeometrica{


    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    @Override
    public double calcularArea() {
        return base*altura;
    }


}
