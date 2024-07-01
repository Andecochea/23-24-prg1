import java.util.Random;
import java.util.Scanner;

public class FiestaDeCotillas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese el número de invitados que acuden a la fiesta : ");
        int numeroPersonas = scanner.nextInt();
        
        
        if (numeroPersonas <= 4) {
            System.out.println("El número de invitados debe ser mayor a 4 para que el rumor pueda propagarse.");
            return;
        }
        
        int[] vecesEscuchado = new int[numeroPersonas];
        
        int personaActual = random.nextInt(numeroPersonas);
        vecesEscuchado[personaActual]++;
        
        System.out.println("El rumor empieza en la persona: " + personaActual);
        
        while (true) {
            int nuevaPersona;
            do {
                nuevaPersona = random.nextInt(numeroPersonas);
            } while (nuevaPersona == personaActual || vecesEscuchado[nuevaPersona] >= 2);

            System.out.println("La persona " + personaActual + " le cuenta el rumor a la persona " + nuevaPersona);
            vecesEscuchado[nuevaPersona]++;
            if (vecesEscuchado[nuevaPersona] == 2) {
                System.out.println("El rumor se detiene porque la persona " + nuevaPersona + " ya había escuchado el rumor dos veces.");
                break;
            }

            personaActual = nuevaPersona;
        }
        
    }
}