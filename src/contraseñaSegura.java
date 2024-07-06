import java.util.Scanner;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class contraseñaSegura {


    public static void main(String[] args){

        while(true){

            Scanner sc = new Scanner(System.in);

            int mayuscula=0;
            int minuscula=0;
            int space=0;

            System.out.println("introduzca su contraseña porfavor: ");
            String contrasena = sc.nextLine();

            if(contrasena.length()>=8){

                for(int i=0; i<contrasena.length(); i++){
                    char letra=contrasena.charAt(i);

                    if(Character.isLetter(letra)){
                        if(isUpperCase(letra)){
                            mayuscula++;
                        }

                        if(isLowerCase(letra)) {
                            minuscula++;
                        }
                    }



                    if(Character.isWhitespace(letra)){
                        space++;
                    }
                }

            }

            else{
                System.out.println("la contraseña debe tener 8 caracteres");
            }


            if(mayuscula>=1 && minuscula>=1 &&space>=1){

                break;
            }
            else{
                System.out.println("la contraseña es insegura vuelve a intentar");
            }
        }

    }
}
