import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class calculo_ventas {

    public static void push(double dato, int i, int j, double[][] arreglo) {
        arreglo[i][j] = dato;
    }

    public static void mostrar(int sucursales, double[][] matriz) {
        System.out.println("\n--- MATRIZ DE VENTAS INGRESADA ---");
        for (int i = 0; i < sucursales; i++) {
            System.out.println("Sucursal " + (i + 1) + ": " + Arrays.toString(matriz[i]));
        }
    }

    public static double calcularTotalAnual(double[] ventasSucursal) {
        double total = 0;
        for (int j = 0; j < 12; j++) {
            total += ventasSucursal[j];
        }
        return total;
    }

    public static int obtenerMejorMes(double[] ventasSucursal) {
        int mesMayor = 0;
        double mayorVenta = ventasSucursal[0];
        for (int j = 1; j < 12; j++) {
            if (ventasSucursal[j] > mayorVenta) {
                mayorVenta = ventasSucursal[j];
                mesMayor = j;
            }
        }
        return mesMayor + 1;
    }

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("¿Cuantas sucursales son?");
        int sucursales = tc.nextInt();

        double ventas[][] = new double[sucursales][12];

        for (int i = 0; i < sucursales; i++) {
            System.out.println("-------------------");
            System.out.println("Registro para la sucursal " + (i + 1));
            for (int j = 0; j < 12; j++) {
                System.out.print("Ingresa la venta del mes " + (j + 1) + ": ");
                double ven = tc.nextDouble();
                push(ven, i, j, ventas);
            }
        }

        mostrar(sucursales, ventas);

        double[] totalesAnuales = new double[sucursales];
        double sumaGlobal = 0;

        System.out.println("\n================================================");
        System.out.println("           RESULTADOS POR SUCURSAL");
        System.out.println("================================================");

        for (int i = 0; i < sucursales; i++) {
            double total = calcularTotalAnual(ventas[i]);
            double promedio = total / 12.0;
            int mejorMes = obtenerMejorMes(ventas[i]);

            totalesAnuales[i] = total;
            sumaGlobal += total;

            System.out.println(">> Sucursal " + (i + 1) + ":");
            System.out.println("   Total Anual: $" + df.format(total));
            System.out.println("   Promedio Mensual: $" + df.format(promedio));
            System.out.println("   Mes con mayor venta: Mes " + mejorMes + " ($" + df.format(ventas[i][mejorMes - 1]) + ")");
            System.out.println("------------------------------------------------");
        }

        double promedioGlobal = sumaGlobal / sucursales;
        System.out.println("\nPromedio Global Anual: $" + df.format(promedioGlobal));
        System.out.println("Sucursales que superan el promedio global:");
        for (int i = 0; i < sucursales; i++) {
            if (totalesAnuales[i] > promedioGlobal) {
                System.out.println("-> Sucursal " + (i + 1) + " con un total de $" + df.format(totalesAnuales[i]));
            }
        }

        double[] totalesOrdenados = Arrays.copyOf(totalesAnuales, totalesAnuales.length);
        Arrays.sort(totalesOrdenados);

        System.out.println("\n================================================");
        System.out.println("   RANKING DE VENTAS ANUALES (MAYOR A MENOR)");
        System.out.println("================================================");

        for (int i = totalesOrdenados.length - 1; i >= 0; i--) {
            for (int j = 0; j < sucursales; j++) {
                if (totalesAnuales[j] == totalesOrdenados[i]) {
                    System.out.println("Sucursal " + (j + 1) + " - Total Anual: $" + df.format(totalesOrdenados[i]));
                    totalesAnuales[j] = -1;
                    break;
                }
            }
        }

        tc.close();
    }
}