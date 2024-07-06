public class trabajo {

    public static void main(String[] args) {
        int dia=4;
        String nombreDia;

        switch (dia){
            case 1: nombreDia="Lunes";
                break;
            case 2: nombreDia="Martes";
                break;
            case 3: nombreDia="Miercoles";
                break;
            case 4: nombreDia="jueves";
                break;
            case 5: nombreDia="viernes";
                break;
            case 6: nombreDia="sabado";
                break;
            case 7: nombreDia="Domingo";
            break;
            default: nombreDia="número de dia invalido";
            break;

        }
        System.out.printf("el dia de la semana selecionado es: " + nombreDia);
    }
}


