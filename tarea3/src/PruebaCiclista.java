public class PruebaCiclista {
    public static void main(String[] args) {
        Ciclista ciclis1 = new Ciclista("Egan Bernal", 26, 4200);
        Ciclista ciclis2 = new Ciclista("Julia Robert", 31, 4500);
        Ciclista ciclis3 = new Ciclista("Pedro Palacios", 43, 2300);

        // Mostrar información
        ciclis1.mostrarInformacionCiclista();
        System.out.println("Ciclista 2");
        ciclis2.mostrarInformacionCiclista();
        System.out.println("Ciclista 3");
        ciclis3.mostrarInformacionCiclista();

        System.out.println();

        // Actualizar kilómetros
        ciclis1.actualizarKm(230);
        ciclis2.actualizarKm(82);
        ciclis3.actualizarKm(302);

        System.out.println();

        // Mostrar promedios mensuales
        System.out.println("Promedio mensual de " + ciclis1.nombre + ": " + ciclis1.calcularPromedio() + " km");
        System.out.println("Promedio mensual de " + ciclis2.nombre + ": " + ciclis2.calcularPromedio() + " km");
        System.out.println("Promedio mensual de " + ciclis3.nombre + ": " + ciclis3.calcularPromedio() + " km");

    }
}






