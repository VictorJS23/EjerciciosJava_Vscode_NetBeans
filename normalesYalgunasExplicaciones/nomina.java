import java.util.Scanner;

public class nomina {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int cantEmpleados;
        System.out.print("Ingrese la cantidad de empleados :\n ");
        cantEmpleados = input.nextInt();
        input.nextLine();
        System.out.println("");

        String[] nombres = new String[cantEmpleados];
        System.out.println("Ingrese los nombres de los trabajores :\n ");
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = input.nextLine();
        }
        System.out.println("");

        float[] salarios = new float[cantEmpleados];
        System.out.println("Ingrese los salarios correspondientes cada trabajador :\n ");
        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = input.nextFloat();
        }
        System.out.println("");

        float[] inssLaboral = new float[cantEmpleados];

        for (int i = 0; i < inssLaboral.length; i++) {
            inssLaboral[i] = salarios[i] * 0.07f;
        }

        float[] ir = new float[cantEmpleados];
        for (int i = 0; i < ir.length; i++) {
            if (salarios[i] > 8000) {
                ir[i] = ((((salarios[i] - inssLaboral[i]) * 12) - 100000) * 0.15f) / 12;
            }
        }

        float[] totalRetenciones = new float[cantEmpleados];
        for (int i = 0; i < totalRetenciones.length; i++) {
            totalRetenciones[i] = inssLaboral[i] + ir[i];
        }

        float[] netoRecibir = new float[cantEmpleados];
        for (int i = 0; i < netoRecibir.length; i++) {
            netoRecibir[i] = salarios[i] - totalRetenciones[i];
        }

        float[] aguinaldo = new float[cantEmpleados];
        for (int i = 0; i < aguinaldo.length; i++) {
            aguinaldo[i] = salarios[i] / 12;
        }

        float[] vacaciones = new float[cantEmpleados];
        for (int i = 0; i < vacaciones.length; i++) {
            vacaciones[i] = salarios[i] / 12;
        }

        float[] indemnisaciones = new float[cantEmpleados];
        for (int i = 0; i < indemnisaciones.length; i++) {
            indemnisaciones[i] = salarios[i] / 12;
        }

        float[] inssPatronal = new float[cantEmpleados];
        for (int i = 0; i < inssPatronal.length; i++) {
            if (cantEmpleados < 50) {
                inssPatronal[i] = salarios[i] * 0.215f;
            } else if (cantEmpleados > 50) {
                inssPatronal[i] = salarios[i] * 0.225f;
            }
        }

        float[] inatec = new float[cantEmpleados];
        for (int i = 0; i < inatec.length; i++) {
            inatec[i] = salarios[i] * 0.02f;
        }

        float[] total = new float[cantEmpleados];
        for (int i = 0; i < total.length; i++) {
            total[i] = aguinaldo[i] + vacaciones[i] + indemnisaciones[i] + inssPatronal[i] + inatec[i];
        }

        System.out.println("La nomina correspondiente es :\n");

        System.out.println(
                "Nombre | Salario | INSSLaboral | IR | TotalRetenciones | NetoRecibir | Aguinaldo | Vacaciones | Indemnizaciones | INSSPatronal | INATEC | Total | \n");

        for (int i = 0; i < cantEmpleados; i++) {
            System.out.print(nombres[i] + " | " + salarios[i] + " | " + inssLaboral[i] + " | " + ir[i] + " | "
                    + totalRetenciones[i] + " | " + netoRecibir[i] + " | " + aguinaldo[i] + " | " + vacaciones[i]
                    + " | "
                    + indemnisaciones[i] + " | " + inssPatronal[i] + " | " + inatec[i] + " | " + total[i] + " | ");
            System.out.println("\n");
        }

        input.close();

    }
}