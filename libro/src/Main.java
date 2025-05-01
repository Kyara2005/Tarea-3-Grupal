import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Libro> lista = new ArrayList<>();
        String titulo, autor, r, otro;
        int anio, nuevoAnio;
        Libro l;

        while (true) {
            System.out.print("Título: ");
            titulo = sc.nextLine();

            System.out.print("Autor: ");
            autor = sc.nextLine();

            System.out.print("Año: ");
            anio = sc.nextInt();
            sc.nextLine(); // limpiar

            l = new Libro(titulo, autor, anio);
            l.mostrar();

            System.out.print("¿Cambiar año? si/no: ");
            r = sc.nextLine();
            if (r.equalsIgnoreCase("si")) {
                System.out.print("Nuevo año: ");
                nuevoAnio = sc.nextInt();
                sc.nextLine(); // limpiar
                l.cambiarAnio(nuevoAnio);
                System.out.println("Actualizado:");
                l.mostrar();
            }

            lista.add(l);

            System.out.print("¿Agregar otro libro? si/no: ");
            otro = sc.nextLine();
            if (!otro.equalsIgnoreCase("si")) break;
        }

        System.out.println("\nLibros guardados:");
        for (Libro libro : lista) {
            System.out.println();
            libro.mostrar();
        }

        sc.close();
    }
}
