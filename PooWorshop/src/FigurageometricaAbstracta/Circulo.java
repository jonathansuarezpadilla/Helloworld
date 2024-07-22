package FigurageometricaAbstracta;

import java.security.PrivateKey;

public class Circulo extends FiguraAbstractaGeometrica{

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }



}
