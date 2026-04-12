import java.util.Scanner;

public class intentostime {

    public static void main(String[] args){
        boolean validate = true;

        int timeP = 3000;
        int timeB = 5000;

        int pinC = 3456, pinU;
        String pin;

        int contador=0;
        int[] intentos = {5,3,1};
        int iter = 0;

        String mess1 = "Procesando...";


        Scanner cs = new Scanner(System.in);


        while(validate){
            String mess2 = "Fallaste " +  intentos[iter] + " veces vuelve a intentarlo dentro de 30 segundo.\n";

            if (contador >= intentos[iter]){
                //validando iteraciones
                if (iter == 2){
                    System.out.println("los siento alcanasaste el limite de intentos\nContactece con el area encargada.");
                    validate = false;
                    break;
                }
                //teimpo de blokeo..
                proccesTime(timeB, mess2);
                iter++;
                contador = 0;

            }

            pin = datos(cs, contador, intentos[iter]);


            if (!pin.matches(" ?\\d+")){
                System.out.println("Lo siento no puedes ingresar caracteres ni texto, solo numeros!\nVuelva a intentarlo.\n");
                contador++;
                continue;
            }

            //teimpo de procesado..
            proccesTime(timeP, mess1);

            //parseando el string a entero
            pinU = Integer.parseInt(pin.trim());

            //validar desblokeo
            if (validateUser(pinC, pinU)) {
                contador++;
            } else {
                break;
            }

        }
    }

    //pedir datos y msotar intentos
    private static String datos(Scanner cs, int contador, int intentos){
        System.out.println("-----------------");
        System.out.printf("Intentos: %d\n",intentos-contador);
        System.out.println("-----------------");
        System.out.println("Ingrese su PIN: ");

        return cs.nextLine();
    }

    //Tiempo para procesar
    private static void proccesTime(int tiempo, String messages){
        try {
            System.out.println(messages);
            Thread.sleep(tiempo);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    //validando Ingreso de usuario
    private static boolean validateUser(int pin, int pinU){
        if (pinU == pin){
            System.out.println("Desbloqueado!...");
            return false;
        }else {
            System.out.println("PIN incorrecto\nVuelva a intentarlo.\n");
            return true;
        }
    }


}
