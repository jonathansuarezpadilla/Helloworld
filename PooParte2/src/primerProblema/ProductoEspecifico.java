package primerProblema;

public class ProductoEspecifico extends Producto {

    String categoria;
    String marca;


    public ProductoEspecifico(String name, int id,double precio,String categoria,String Marca) {
        super(id, name , precio);
        this.categoria = categoria;
        this.marca = Marca;
    }




}
