package Ejercicio4;

public class If {

    public static void main(String[] args) {

        int numeroIf = -10;
        int numeroWhile = -6;
        int numeroWhile2 = 2;
        // If:
        if(numeroIf > 0) {
            System.out.println("El número es Positivo");
        } else if(numeroIf < 0) {
            System.out.println("El número es negativo");
        } else if(numeroIf == 0) {
            System.out.println("El número es 0");
        }

        // While
        while(numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // Do While
        do {
            numeroWhile2++;
            System.out.println(numeroWhile2);
        } while(numeroWhile2 < 3);

        // for

        for(int i = 0; i <= 3; i++) {
            System.out.println(i);
        }

        // Switch
        String estacion = "Estación Martes";

        switch(estacion) {
            case "Estación Lunes":
                System.out.println("Estación de Lunes");
                break;
            case "Estación Martes":
                System.out.println("Estación de Martes");
                break;
            case "Estación Miércoles":
                System.out.println("Estación de Miércoles");
                break;
            default:
                System.out.println("no hay estación");
        }


    }

}
