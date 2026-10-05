import java.util.Scanner;

public class GestionCalificacionesSimple {

    // Función 1: Lectura de datos con validación (0 a 10)
    public static void leerNotas(double[][] notas, int n, int m, Scanner sc) {
        System.out.println("\n--- INGRESO DE NOTAS ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            for (int j = 0; j < m; j++) {
                double nota;
                do {
                    System.out.print("  Examen " + (j + 1) + " (0 a 10): ");
                    nota = sc.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("    ¡Error! La nota debe estar entre 0 y 10. Intente de nuevo.");
                    }
                } while (nota < 0 || nota > 10);
                
                notas[i][j] = nota;
            }
        }
    }

    // Función 2: Calcular promedios de estudiantes
    public static void calcularPromedios(double[][] notas, double[] promedios, int n, int m) {
        System.out.println("\n--- PROMEDIOS DE ESTUDIANTES ---");
        for (int i = 0; i < n; i++) {
            double suma = 0;
            for (int j = 0; j < m; j++) {
                suma = suma + notas[i][j];
            }
            promedios[i] = suma / m;
            System.out.println("Estudiante " + (i + 1) + ": " + promedios[i]);
        }
    }

    // Función 3: Alumnos destacados (9 a 10)
    public static void mostrarDestacados(double[] promedios, int n) {
        System.out.println("\n--- ESTUDIANTES ENTRE 9 Y 10 ---");
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (promedios[i] >= 9.0 && promedios[i] <= 10.0) {
                System.out.println("Estudiante " + (i + 1) + " (Promedio: " + promedios[i] + ")");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay estudiantes con promedio entre 9 y 10.");
        }
    }

    // Función 4: Alumnos bajos (menores a 7)
    public static void mostrarBajos(double[] promedios, int n) {
        System.out.println("\n--- ESTUDIANTES MENORES A 7.0 ---");
        int contador = 0;
        for (int i = 0; i < n; i++) {
            if (promedios[i] < 7.0) {
                System.out.println("Estudiante " + (i + 1) + " (Promedio: " + promedios[i] + ")");
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No hay estudiantes con promedio menor a 7.0.");
        }
    }

    // Función 5: Evaluación del examen con mejor y peor promedio
    public static void evaluarExamenes(double[][] notas, int n, int m) {
        double[] promediosExamen = new double[m];

        for (int j = 0; j < m; j++) {
            double suma = 0;
            for (int i = 0; i < n; i++) {
                suma = suma + notas[i][j];
            }
            promediosExamen[j] = suma / n;
        }

        int examenMayor = 0;
        int examenMenor = 0;

        for (int j = 1; j < m; j++) {
            if (promediosExamen[j] > promediosExamen[examenMayor]) {
                examenMayor = j;
            }
            if (promediosExamen[j] < promediosExamen[examenMenor]) {
                examenMenor = j;
            }
        }

        System.out.println("\n--- RESULTADOS POR EXAMEN ---");
        System.out.println("Examen con promedio MÁS ALTO: Examen " + (examenMayor + 1) + " (" + promediosExamen[examenMayor] + ")");
        System.out.println("Examen con promedio MÁS BAJO: Examen " + (examenMenor + 1) + " (" + promediosExamen[examenMenor] + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de estudiantes (N): ");
        int n = sc.nextInt();

        System.out.print("Número de exámenes (M): ");
        int m = sc.nextInt();

        double[][] notas = new double[n][m];
        double[] promedios = new double[n];

        // Llamada a las funciones
        leerNotas(notas, n, m, sc);
        calcularPromedios(notas, promedios, n, m);
        mostrarDestacados(promedios, n);
        mostrarBajos(promedios, n);
        evaluarExamenes(notas, n, m);

        sc.close();
    }
}