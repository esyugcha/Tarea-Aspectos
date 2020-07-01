package application;

import java.io.InputStream;
import java.util.Scanner;

public class Operaciones {
    int numero1;
    int numero2;
    InputStream io = System.in;
    Scanner sc = new Scanner(io);

    public void CargarDatos() {
        System.out.print("Ingrese primer numero: ");
        numero1 = sc.nextInt();
        System.out.print("Ingrese segundo numero: ");
        numero2 = sc.nextInt();
    }

    public void suma() {
        resultado(numero1+numero2);
    }

    public void resta() {
        resultado(numero1-numero2);
    }

    public void multiplicacion() {
        resultado(numero1*numero2);
    }

    public void resultado(int resultado) {
        System.out.println(resultado);
        return;
    }
}