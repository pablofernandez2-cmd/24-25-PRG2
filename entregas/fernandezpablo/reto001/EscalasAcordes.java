import java.util.Scanner;

public class EscalasAcordes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tonos = {"Do", "Do#", "Re", "Re#", "Mi", "Fa", "Fa#", "Sol", "Sol#", "La", "La#", "Si"};

        System.out.print("Ingrese una la nota a trabajar: 1: Do, 2: Do#, 3: Re, 4: Re#, 5: Mi, ...");
        System.out.println();
        int notaBase = scanner.nextInt();

    }
}