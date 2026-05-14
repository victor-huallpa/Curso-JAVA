package CursoTodoCode;

public class OpeRelacion {
    public static void operRelacion(){
        //NOTA: Los operadores de relacion lo que devuelevn son valores boleanos
        boolean bol1, bol2, bol3, bol4, bol5, bol6;
        //IGUAL '=='
        bol1 = 12==12;
        bol1 = 'k'=='k';
        bol1 = "Hello" == "hello";
        bol1 = 12.00 == 12.00;

        //DIFERENTE '!='
        bol2 = 1!=2;
        bol2 = 'k' != 'p';
        bol2 = "Hello" != "hello";
        bol2 = 0.12 != 0.23;

        //MAYOR QUE '>'
        bol3 = 'k'> 'z';
//        bol3 = "Hello" > "hello";
        bol3 = 4 > 6;
        bol3 = 3.45 > 12.4;

        //MENOR QUE '<'
        bol4 = 'k'< 'z';
//        bol4 = "Hello" > "hello";
        bol4 = 4 < 6;
        bol4 = 3.45 < 12.4;

        //MAYOR IGUAL '>='
        bol5 = 'k'>= 'z';
//        bol5 = "Hello" > "hello";
        bol5 = 4 >= 6;
        bol5 = 3.45 >= 12.4;

        //MENOR IGUAL '<='
        bol6 = 'k'<= 'z';
//        bol6 = "Hello" <= "hello";
        bol6 = 4 <= 6;
        bol6 = 3.45 <= 12.4;

    }
}
