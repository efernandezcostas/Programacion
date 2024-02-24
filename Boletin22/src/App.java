public class App {
    public static void main(String[] args) {
        String[] nombresEquipos = {"Celta", "Bilbao", "Malaga"};
        int[][] golesPorJornada = {
                {3, 4, 2}, // Celta
                {1, 2, 1}, // Bilbao
                {3, 0, 1}  // Malaga
        };

        //1
        System.out.println("Goles por jornada:");
        for (int i = 0; i < nombresEquipos.length; i++) {
            System.out.print(nombresEquipos[i] + ": ");
            for (int j = 0; j < golesPorJornada[i].length; j++) {
                System.out.print(golesPorJornada[i][j] + " ");
            }
            System.out.println();
        }

        // 2.
        int[] totalGoles = new int[nombresEquipos.length];
        for (int i = 0; i < golesPorJornada.length; i++) {
            for (int j = 0; j < golesPorJornada[i].length; j++) {
                totalGoles[i] += golesPorJornada[i][j];
            }
        }

        // 3.
        System.out.println("\nEquipo con más goles por jornada:");
        for (int j = 0; j < 3; j++) { // Asumiendo 3 jornadas
            int maxGoles = 0;
            String equipoMaxGoles = "";
            for (int i = 0; i < nombresEquipos.length; i++) {
                if (golesPorJornada[i][j] > maxGoles) {
                    maxGoles = golesPorJornada[i][j];
                    equipoMaxGoles = nombresEquipos[i];
                }
            }
            System.out.println("Jornada " + (j + 1) + ": " + equipoMaxGoles);
        }

        // 4.
        int maxGoles = 0;
        String equipoMaxGoles = "";
        int jornadaMaxGoles = 0;
        for (int i = 0; i < nombresEquipos.length; i++) {
            for (int j = 0; j < 3; j++) { // Asumiendo 3 jornadas
                if (golesPorJornada[i][j] > maxGoles) {
                    maxGoles = golesPorJornada[i][j];
                    equipoMaxGoles = nombresEquipos[i];
                    jornadaMaxGoles = j + 1;
                }
            }
        }
        System.out.println("\nEquipo con más goles en una jornada: " + equipoMaxGoles + " en la jornada " + jornadaMaxGoles);

        // 5.
        System.out.println("\nConsulta de goles por equipo y jornada:");
        String equipoConsulta = "Celta";
        int jornadaConsulta = 2;
        int indexEquipoConsulta = java.util.Arrays.asList(nombresEquipos).indexOf(equipoConsulta);
        if (indexEquipoConsulta != -1) {
            System.out.println("Goles de " + equipoConsulta + " en la jornada " + jornadaConsulta + ": " + golesPorJornada[indexEquipoConsulta][jornadaConsulta - 1]);
        } else {
            System.out.println("Equipo no encontrado.");
        }
    }
}
