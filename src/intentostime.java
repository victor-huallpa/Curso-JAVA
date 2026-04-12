import java.util.Scanner;

public class intentostime {

    public static void main(String[] args){
        int timeP = 3000;
        int timeB = 5000;
        int pinC = 3456, pinU, contador=0;
        String pin;
        Scanner cs = new Scanner(System.in);


        while(contador < 4){
            if (contador == 3){
                try{
                    System.out.println("Fallaste 3 veces vuelve a intentarlo dentro de 30 segundo.");
                    contador = 0;
                    Thread.sleep(timeB);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            System.out.println("-----------------");
            System.out.printf("Intentos: %d\n",3-contador);
            System.out.println("-----------------");
            System.out.println("Ingrese su PIN: ");
            pin = cs.nextLine();

            //teimpo de procesado..
            try {
                System.out.println("Procesando...");
                Thread.sleep(timeP);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            if (!pin.matches(" ?\\d+")){
                System.out.println("Lo siento no puedes ingresar caracteres ni texto, solo numeros!\nVuelva a intentarlo.\n");
                contador++;
                continue;
            }

            //parseando el string a entero
            pinU = Integer.parseInt(pin.trim());

            if (pinU == pinC){
                System.out.println("Desbloqueado!...");
                break;
            }else {
                System.out.println("PIN incorrecto\nVuelva a intentarlo.\n");
            }
            contador++;

        }
    }
}
