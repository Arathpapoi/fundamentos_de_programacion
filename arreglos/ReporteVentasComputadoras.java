import java.util.Scanner;

public class ReporteVentasComputadoras {

    public static void leerVentas(int[][] ventas, int n, int m, Scanner sc) {
        System.out.println("\n--- REGISTRO DE VENTAS ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Vendedor " + (i + 1) + ", Zona " + (j + 1) + ": ");
                ventas[i][j] = sc.nextInt();
            }
        }
    }

    public static void obtenerZonaMasVendio(int[][] ventas, int n, int m) {
        int zonaMasVendio = 0;
        int maxVentas = -1;

        for (int j = 0; j < m; j++) {
            int sumaZona = 0;
            for (int i = 0; i < n; i++) {
                sumaZona = sumaZona + ventas[i][j];
            }
            if (sumaZona > maxVentas) {
                maxVentas = sumaZona;
                zonaMasVendio = j;
            }
        }

        System.out.println("Zona con más ventas: Zona " + (zonaMasVendio + 1) + " (" + maxVentas + " comps.)");
    }

    public static void obtenerVendedorMenosVendio(int[][] ventas, int n, int m, double precioUnitario) {
        int vendedorMenosVendio = 0;
        int minVentas = 100000; 

        for (int i = 0; i < n; i++) {
            int sumaVendedor = 0;
            for (int j = 0; j < m; j++) {
                sumaVendedor = sumaVendedor + ventas[i][j];
            }
            if (sumaVendedor < minVentas) {
                minVentas = sumaVendedor;
                vendedorMenosVendio = i;
            }
        }

        double montoTotal = minVentas * precioUnitario;
        System.out.println("Vendedor que menos vendió: Vendedor " + (vendedorMenosVendio + 1) + " (" + minVentas + " comps. | $" + montoTotal + ")");
    }

    public static void obtenerVendedorMasVendio(int[][] ventas, int n, int m, double precioUnitario) {
        int vendedorMasVendio = 0;
        int maxVentas = -1;
        for (int i = 0; i < n; i++) {
            int sumaVendedor = 0;
            for (int j = 0; j < m; j++) {
                sumaVendedor = sumaVendedor + ventas[i][j];
            }
            if (sumaVendedor > maxVentas) {
                maxVentas = sumaVendedor;
                vendedorMasVendio = i;
            }
        }

        double montoTotal = maxVentas * precioUnitario;
        System.out.println("Vendedor que más vendió: Vendedor " + (vendedorMasVendio + 1) + " (" + maxVentas + " comps. | $" + montoTotal + ")");
    }

    public static void obtenerTotalGeneral(int[][] ventas, int n, int m, double precioUnitario) {
        int totalComputadoras = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                totalComputadoras = totalComputadoras + ventas[i][j];
            }
        }

        double recaudacionTotal = totalComputadoras * precioUnitario;
        System.out.println("Total general: " + totalComputadoras + " comps. | Recaudación: $" + recaudacionTotal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número de vendedores (n): ");
        int n = sc.nextInt();

        System.out.print("Número de zonas (m): ");
        int m = sc.nextInt();

        System.out.print("Precio unitario ($): ");
        double precioUnitario = sc.nextDouble();

        int[][] ventas = new int[n][m];

        leerVentas(ventas, n, m, sc);

        System.out.println("\n--- RESULTADOS ---");
        obtenerZonaMasVendio(ventas, n, m);
        obtenerVendedorMenosVendio(ventas, n, m, precioUnitario);
        obtenerVendedorMasVendio(ventas, n, m, precioUnitario);
        obtenerTotalGeneral(ventas, n, m, precioUnitario);

        sc.close();
    }
}