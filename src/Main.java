import java.util.Scanner;

public class Main {

Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        double minAltura = 0, maxAltura = 0, promAltura, maxPeso = 0, minPeso = 0, promPeso,promImc, maxImc = 0, minImc = 0, sumAltura = 0 , sumPeso = 0, sumImc = 0;
        int cantidad;
        int opc;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de estudiantes");
        cantidad = scanner.nextInt();
        scanner.nextLine();

        double[] estaturas = new double[cantidad];
        double[] peso = new double[cantidad];
        double[] imc = new double[cantidad];
        String[] nombres = new String[cantidad];

        for (int n = 0; n < nombres.length; n++) {
            System.out.println("Señor usuario por favor ingresar el nombre del estudiante " + (n+1));
            nombres[n] = scanner.nextLine();
        }

        for (int i = 0; i < estaturas.length; i++) {
            System.out.println("Señor usuario por favor ingresar la estatura del estudiante " + nombres[i]);

            estaturas[i] = scanner.nextDouble();
            sumAltura += estaturas[i];
        }

        for (int k = 0; k < peso.length; k++) {
            System.out.println("Señor usuario por favor ingresar el peso del estudiante " + nombres[k]);

            peso[k] = scanner.nextDouble();
            sumPeso += peso[k];
        }

        for (int o = 0; o < imc.length; o++) {
            imc[o] = peso[o]/Math.pow(estaturas[o],2);
        }

        for (int l = 0; l < estaturas.length; l++) {
            maxAltura = estaturas[0];
            if (maxAltura < estaturas[l]) {
                maxAltura = estaturas[l];
            }
        }

        for (int k = 0; k < peso.length; k++) {
            maxPeso = peso[0];
            if (maxPeso < peso[k]) {
                maxPeso = peso[k];
            }
        }

        for (int k = 0; k < imc.length; k++) {
            maxImc = imc[0];
            if (maxImc < imc[k]) {
                maxImc = imc[k];
            }
        }

        for (int l = 0; l < estaturas.length; l++) {
            minAltura = estaturas[0];
            if (minAltura > estaturas[l]) {
                minAltura = estaturas[l];
            }
        }

        for (int k = 0; k < peso.length; k++) {
            minPeso = peso[0];
            if (minPeso > peso[k]) {
                minPeso = peso[k];
            }
        }

        for (int k = 0; k < imc.length; k++) {
            minImc = imc[0];
            if (minImc > imc[k]) {
                minImc = imc[k];
            }
        }

        // obtener promedio
        promPeso = sumPeso/cantidad;
        promAltura = sumAltura/cantidad;
        promImc = sumImc/cantidad;


        System.out.println("Señor usuario por favor ingresar una de las siguientes opciones");
        System.out.println("1. Estadisticas de altura");
        System.out.println("2. Estadisticas de peso");
        System.out.println("3. Estadisticas de imc");
        System.out.println("4. salir");
        opc = scanner.nextInt();


        do {
            switch (opc) {
                case 1:
                    System.out.println("La altura maxima es " + maxAltura);
                    System.out.println("la altura minima es " + minAltura);
                    System.out.println("La altura promedio " + promAltura);
                    break;
                case 2:
                    System.out.println("el peso maximo es " + maxPeso);
                    System.out.println("el peso minimo es " + minPeso);
                    System.out.println("el peso promedio " + promPeso);
                    break;
                case 3:
                    System.out.println("el imc maximo es " + maxImc);
                    System.out.println("el imc minimo es " + minImc);
                    System.out.println("el imc promedio " + promImc);
                    break;
                case 4:
                    System.out.println("Gracias por usar el sistema");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        } while (opc != 4);
    }
}
