import java.util.Scanner;

public class Cotillas{
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de invitados que acuden a la fiesta : ");
        int numeroPersonas = scanner.nextInt();

        if (numeroPersonas <= 4) {
            System.out.println("El número de invitados debe ser mayor a 4 para que el rumor pueda propagarse.");
            return;
        }
    }
}