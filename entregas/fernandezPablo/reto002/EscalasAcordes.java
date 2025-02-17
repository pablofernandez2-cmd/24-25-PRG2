package entregas.fernandezPablo.reto002;

import java.util.Scanner;

class EscalasAcordes {
    static final String[] NOTAS = { "DO", "DO#", "RE", "RE#", "MI", "FA", "FA#", "SOL", "SOL#", "LA", "LA#", "SI" };
    static final int SEMITONO = 1,  TONO =  SEMITONO + SEMITONO, TONOYMEDIO = TONO + SEMITONO;
    static final int[][] ESCALAS = 
    {
        { TONO, TONO, SEMITONO, TONO, TONO, TONO, SEMITONO },
        { TONO, SEMITONO, TONO, TONO, SEMITONO, TONO, TONO },
        { TONO, SEMITONO, TONO, TONO, SEMITONO, TONOYMEDIO, SEMITONO },
        { TONO, SEMITONO, TONO, TONO, TONO, TONO, SEMITONO },
        { TONO, TONO, TONOYMEDIO, TONO, TONOYMEDIO },
        { TONOYMEDIO, TONO, TONO, TONOYMEDIO, TONO },
        { TONO, SEMITONO, TONO, TONO, TONO, SEMITONO, TONO },
        { SEMITONO, TONO, TONO, TONO, SEMITONO, TONO, TONO },
        { TONO, TONO, TONO, SEMITONO, TONO, TONO, SEMITONO },
        { TONO, TONO, SEMITONO, TONO, TONO, SEMITONO, TONO },
        { SEMITONO, TONO, TONO, SEMITONO, TONO, TONO, TONO },
        { TONO, TONO, TONO, TONO, TONO, TONO }
    };

    public static void main(String[] args) {
        String nota = preguntarNota();
        int[] escalaElegida = preguntarEscala();
        String[] escalaGenerada = construirEscala(nota, escalaElegida);
        String[] acorde = construirAcorde(escalaGenerada);

        System.out.println("Escala en " + nota + ":");
        mostrarSecuencia(escalaGenerada);
        System.out.println("Acorde:");
        mostrarSecuencia(acorde);
    }

    static void mostrarSecuencia(String[] secuenciaNotas) {
        for (String nota : secuenciaNotas) {
            System.out.print("[" + nota + "] ");
        }
        System.out.println();
    }

    static String[] construirAcorde(String[] escala) 
    {
        return new String[] { escala[0], escala[2], escala[4] }; 
    }
}