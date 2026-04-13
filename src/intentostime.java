import java.util.Scanner;

public class intentostime {

    public static void main(String[] args){
        boolean validate = true;
        int pinU;
        String pin;

        int timeP = 3000;
        int timeB = 5000;

        int contador=0;
        int[] intentos = {5,3,1};
        int iter = 0;

        Login objL = new Login();

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
                objL.proccesTime(timeB, mess2);
                iter++;
                contador = 0;

            }

            pin = objL.datos(cs, contador, intentos[iter]);


            if (!pin.matches(" ?\\d+")){
                System.out.println("Lo siento no puedes ingresar caracteres ni texto, solo numeros!\nVuelva a intentarlo.\n");
                contador++;
                continue;
            }

            //teimpo de procesado..
            objL.proccesTime(timeP, mess1);

            //parseando el string a entero
            pinU = Integer.parseInt(pin.trim());

            //validar desblokeo
            if (objL.validateUser(objL.getPin(), pinU)) {
                contador++;
            } else {
                break;
            }

        }
    }



}
