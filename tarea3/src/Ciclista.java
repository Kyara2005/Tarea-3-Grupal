public class Ciclista {
    // Atributos
    String nombre;
    int edad;
    double km;

    // Constructor
    public Ciclista(String nombre, int edad, double km) {
        this.nombre = nombre;
        this.edad = edad;
        this.km = km;
    }

    //Metodo
    public void mostrarInformacionCiclista() {
        System.out.println("Nombre del Ciclista: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Kilómetros recorridos: " + km);
    }

    //Actualizar km
    public void actualizarKm(double kmNuevos) {
        this.km += kmNuevos;
        System.out.println("Kilómetros actualizados. Total actual: " + this.km + " km");
    }

    //Promedio
    public double calcularPromedio() {
        return km / 12.0;
    }
}

