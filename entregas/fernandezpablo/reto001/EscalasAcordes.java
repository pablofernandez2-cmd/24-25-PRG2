import java.util.Scanner;

public class EscalasAcordes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tonos = {"Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si"};

        System.out.print("Ingrese una la nota a trabajar: 1: Do, 2: Do#, 3: Re, 4: Re#, 5: Mi, ...");
        System.out.println();
        int notaBase = scanner.nextInt();

        if (notaBase >= 1 && notaBase <= 12) {
            String notaSeleccionada = tonos[notaBase - 1];
            System.out.println("La nota seleccionada es: " + notaSeleccionada);
            String[] escalaMayor = obtenerEscalaMayor(notaSeleccionada, tonos);
            imprimirEscalaMayor(escalaMayor, notaSeleccionada);
            obtenerAndImprimirAcordeMayor(notaSeleccionada, escalaMayor);
        } else {
            System.out.println("Número de nota no válido. Ingresa un valor entre 1 y 12.");
        }

    }
}