public class ejemplo {

    public static void main(String[] args) {
        String cadenaPrincipal = "Esta es una cadena de ejemplo";
        String subcadena = "ejemplo";
        int indice = cadenaPrincipal.indexOf(subcadena);

        if (indice!=-1) {
            System.out.println(indice);
        } else {
            System.out.println("no lo ha encontrado");
        }

    }
}
