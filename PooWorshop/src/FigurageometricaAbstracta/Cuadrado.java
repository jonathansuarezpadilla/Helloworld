package FigurageometricaAbstracta;

public class Cuadrado extends FiguraAbstractaGeometrica{

    private double lado;

    public Cuadrado(double lado){
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
}
