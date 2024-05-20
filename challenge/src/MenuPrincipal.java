import java.io.IOException;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        Datos exchangeRates = null;

        try {
            exchangeRates = conversor.getExchangeRates();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener las tasas de cambio: " + e.getMessage());
            return;
        }

        int opcionMenu = -1;

        while (opcionMenu != 0) {
            System.out.println("BIENVENIDO/A AL CONVERSOR DE MONEDA*");
            System.out.println("Esoge una de las siguientes opciones:");
            System.out.println("1. DOLAR >> PESO COLOMBIANO");
            System.out.println("2. PESO COLOMBIANO >> DOLAR");
            System.out.println("3. DOLAR >> PESO ARGENTINO");
            System.out.println("4. PESO ARGENTINO >> DOLAR");
            System.out.println("5. DOLAR >> REAL BRASILEÑO");
            System.out.println("6. REAL BRASILEÑO >> DOLAR");
            System.out.println("0. Salir");

            opcionMenu = scanner.nextInt();
            double monto, resultado;
            switch (opcionMenu) {
                case 1:
                    System.out.println("Ingrese la cantidad en DOLAR:");
                    monto = scanner.nextDouble();
                    resultado = monto * exchangeRates.getConversionRates().getCOP();
                    System.out.println("Resultado: " + resultado + " COP");
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad en PESO COLOMBIANO:");
                    monto = scanner.nextDouble();
                    resultado = monto / exchangeRates.getConversionRates().getCOP();
                    System.out.println("Resultado: " + resultado + " USD");
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad en DOLAR:");
                    monto = scanner.nextDouble();
                    resultado = monto * exchangeRates.getConversionRates().getARS();
                    System.out.println("Resultado: " + resultado + " ARS");
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad en PESO ARGENTINO:");
                    monto = scanner.nextDouble();
                    resultado = monto / exchangeRates.getConversionRates().getARS();
                    System.out.println("Resultado: " + resultado + " USD");
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad en DOLAR:");
                    monto = scanner.nextDouble();
                    resultado = monto * exchangeRates.getConversionRates().getBRL();
                    System.out.println("Resultado: " + resultado + " BRL");
                    break;
                case 6:
                    System.out.println("Ingrese la cantidad en REAL BRASILEÑO:");
                    monto = scanner.nextDouble();
                    resultado = monto / exchangeRates.getConversionRates().getBRL();
                    System.out.println("Resultado: " + resultado + " USD");
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        }
        scanner.close();
    }
}
