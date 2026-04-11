import java.util.Scanner;

public class contandoIntentos {

    public static void main(String[] args){
        int intentos = 0;
        Integer pin = 6196, userpin;
        String userPinS;
        Scanner cs = new Scanner(System.in);
        while (intentos < 3){
            System.out.println("------------------------");
            System.out.printf("Intentos restantes %d\n",3-intentos);
            System.out.println("------------------------");
            System.out.println("Ingrese su contrasenia:\t");
            userPinS = cs.nextLine();

            if (!userPinS.matches("-?\\d+")){
                System.out.println("Lo siento vuelva a intentarlo.\n");
                intentos++;
                continue;
            }

            //parseando string a integer
            userpin = Integer.parseInt(userPinS);

            if (pin.intValue() == userpin.intValue()){
                System.out.printf("Ingresaste...\n");
                break;
            }else {
                System.out.printf("Clave incorrecta.\nVuelva a intentarlo\n");
                intentos++;
            }
        }

        //mensaje para itnentos = 0
        if (intentos == 3){
            System.out.println("Lo siento acabaste tus intentos vuelve ma;ana!");
        }
    }
}
