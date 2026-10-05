import java.util.Scanner;

public class operaciones4x4 {

    // Función para verificar si un número ya existe en la matriz
    public static boolean existeEnMatriz(int[][] matriz, int filasLlenas, int colActual, int valor) {
        // Revisar filas anteriores completas
        for (int i = 0; i < filasLlenas; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == valor) {
                    return true;
                }
            }
        }
        // Revisar la fila actual hasta la columna llenada
        for (int j = 0; j < colActual; j++) {
            if (matriz[filasLlenas][j] == valor) {
                return true;
            }
        }
        return false;
    }

    // 1. Rellenar la matriz sin repetir números
    public static void rellenarMatriz(int[][] matriz, Scanner sc) {
        System.out.println("\n--- RELLENAR MATRIZ (4x4) SIN NÚMEROS REPETIDOS ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int valor;
                boolean repetido;
                do {
                    System.out.print("Ingrese número para posición [" + (i + 1) + "][" + (j + 1) + "]: ");
                    valor = sc.nextInt();
                    repetido = existeEnMatriz(matriz, i, j, valor);
                    if (repetido) {
                        System.out.println("  ¡Error! El número " + valor + " ya existe en la matriz. Ingrese otro.");
                    }
                } while (repetido);
                matriz[i][j] = valor;
            }
        }
        System.out.println("¡Matriz rellenada con éxito!");
    }

    // Función auxiliar para mostrar la matriz original
    public static void mostrarMatriz(int[][] matriz) {
        System.out.println("\n--- MATRIZ ORIGINAL ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 2. Suma de cada fila y de cada columna
    public static void sumarFilasYColumnas(int[][] matriz) {
        System.out.println("\n--- SUMA DE FILAS Y COLUMNAS ---");
        
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 4; j++) {
                sumaFila = sumaFila + matriz[i][j];
            }
            System.out.println("Suma de Fila " + (i + 1) + ": " + sumaFila);
        }

        for (int j = 0; j < 4; j++) {
            int sumaCol = 0;
            for (int i = 0; i < 4; i++) {
                sumaCol = sumaCol + matriz[i][j];
            }
            System.out.println("Suma de Columna " + (j + 1) + ": " + sumaCol);
        }
    }

    // 3. Suma de una fila elegida por el usuario
    public static void sumarFilaEspecifica(int[][] matriz, Scanner sc) {
        int fila;
        do {
            System.out.print("\nIngrese el número de fila a sumar (1 a 4): ");
            fila = sc.nextInt();
            if (fila < 1 || fila > 4) {
                System.out.println("Fila inválida. Debe ser entre 1 y 4.");
            }
        } while (fila < 1 || fila > 4);

        int suma = 0;
        int i = fila - 1; // Ajuste a índice de Java (0 a 3)
        for (int j = 0; j < 4; j++) {
            suma = suma + matriz[i][j];
        }
        System.out.println("Suma de la Fila " + fila + ": " + suma);
    }

    // 4. Suma de una columna elegida por el usuario
    public static void sumarColumnaEspecifica(int[][] matriz, Scanner sc) {
        int col;
        do {
            System.out.print("\nIngrese el número de columna a sumar (1 a 4): ");
            col = sc.nextInt();
            if (col < 1 || col > 4) {
                System.out.println("Columna inválida. Debe ser entre 1 y 4.");
            }
        } while (col < 1 || col > 4);

        int suma = 0;
        int j = col - 1; // Ajuste a índice de Java (0 a 3)
        for (int i = 0; i < 4; i++) {
            suma = suma + matriz[i][j];
        }
        System.out.println("Suma de la Columna " + col + ": " + suma);
    }

    // 5. Mayor y menor número introducido con su posición
    public static void mostrarMayorYMenor(int[][] matriz) {
        int mayor = matriz[0][0];
        int filaMayor = 1, colMayor = 1;

        int menor = matriz[0][0];
        int filaMenor = 1, colMenor = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                    filaMayor = i + 1;
                    colMayor = j + 1;
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    filaMenor = i + 1;
                    colMenor = j + 1;
                }
            }
        }

        System.out.println("\n--- MAYOR Y MENOR ---");
        System.out.println("Número Mayor: " + mayor + " en la posición [" + filaMayor + "][" + colMayor + "]");
        System.out.println("Número Menor: " + menor + " en la posición [" + filaMenor + "][" + colMenor + "]");
    }

    // 6 y 7. Contar pares e impares
    public static void contarParesEImpares(int[][] matriz) {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares = pares + 1;
                } else {
                    impares = impares + 1;
                }
            }
        }

        System.out.println("\n--- CONTEO PARES E IMPARES ---");
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }

    // 8. Generar e imprimir matriz con cuadrados
    public static void generarMatrizCuadrado(int[][] matriz) {
        int[][] matrizCuadrado = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrizCuadrado[i][j] = matriz[i][j] * matriz[i][j];
            }
        }

        System.out.println("\n--- NUEVA MATRIZ CON EL CUADRADO DE CADA VALOR ---");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizCuadrado[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 9. Suma de la diagonal principal
    public static void sumarDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma = suma + matriz[i][i];
        }
        System.out.println("\nSuma de la diagonal principal: " + suma);
    }

    // 10. Suma de la diagonal inversa
    public static void sumarDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 4; i++) {
            suma = suma + matriz[i][3 - i];
        }
        System.out.println("\nSuma de la diagonal inversa: " + suma);
    }

    // 11. Media de todos los valores
    public static void calcularMedia(int[][] matriz) {
        int sumaTotal = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sumaTotal = sumaTotal + matriz[i][j];
            }
        }
        double media = (double) sumaTotal / 16;
        System.out.println("\nMedia de todos los valores: " + media);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        boolean matrizRellenada = false;
        int opcion = 0;

        do {
            System.out.println("\n=============================================");
            System.out.println("           MENÚ DE OPERACIONES 4x4           ");
            System.out.println("=============================================");
            System.out.println("1. Rellenar la matriz (sin repetir valores)");
            System.out.println("2. Suma de cada fila y cada columna");
            System.out.println("3. Suma de una fila específica");
            System.out.println("4. Suma de una columna específica");
            System.out.println("5. Mostrar el mayor y menor con su posición");
            System.out.println("6. Contar números pares e impares");
            System.out.println("7. Matriz elevada al cuadrado");
            System.out.println("8. Sumar diagonal principal");
            System.out.println("9. Sumar diagonal inversa");
            System.out.println("10. Calcular media de los valores");
            System.out.println("11. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            // Opción de salida
            if (opcion == 11) {
                System.out.println("Programa finalizado.");
                break;
            }

            // Control para asegurar que primero se llene la matriz
            if (opcion != 1 && !matrizRellenada) {
                System.out.println("\n¡DEBES RELLENAR LA MATRIZ PRIMERO! (Elige la opción 1)");
                continue;
            }

            // Si pasa el control y no es la opción 1, se muestra la matriz original antes de ejecutar
            if (opcion != 1 && matrizRellenada) {
                mostrarMatriz(matriz);
            }

            switch (opcion) {
                case 1:
                    rellenarMatriz(matriz, sc);
                    matrizRellenada = true;
                    break;
                case 2:
                    sumarFilasYColumnas(matriz);
                    break;
                case 3:
                    sumarFilaEspecifica(matriz, sc);
                    break;
                case 4:
                    sumarColumnaEspecifica(matriz, sc);
                    break;
                case 5:
                    mostrarMayorYMenor(matriz);
                    break;
                case 6:
                    contarParesEImpares(matriz);
                    break;
                case 7:
                    generarMatrizCuadrado(matriz);
                    break;
                case 8:
                    sumarDiagonalPrincipal(matriz);
                    break;
                case 9:
                    sumarDiagonalInversa(matriz);
                    break;
                case 10:
                    calcularMedia(matriz);
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 11);

        sc.close();
    }
}
