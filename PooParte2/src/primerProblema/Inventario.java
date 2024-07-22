package primerProblema;

import java.util.ArrayList;

public class Inventario {

    ArrayList<ProductoEspecifico> productos=new ArrayList<>();

    public void agregar(ProductoEspecifico informacion){
        productos.add(informacion);

    }

    public void remover(String eliminacion){
        ProductoEspecifico productoAEliminar = null;
        for(ProductoEspecifico producto: this.productos){

            if(producto.getNombre().equals(eliminacion)){
                productoAEliminar = producto;
            };
        }
        if (productoAEliminar == null) {
            System.out.println("No exitste ");
            return;
        }
        this.productos.remove(productoAEliminar);
    }

    public void listar(){
        for(ProductoEspecifico producto:this.productos){
            System.out.println(producto.getNombre());
        }
    }

    public void buscar(String busqueda){
            boolean encontrado=false;

            for(ProductoEspecifico producto:this.productos){
                if(producto.getNombre().equals(busqueda)){
                    encontrado=true;
                    System.out.println("El producto se encuentra en la lista");
                }

            }

            if(encontrado==false){
                System.out.println("El producto no se encuentra en la lista");
            }

    }

}
