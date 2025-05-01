class Libro {
    String titulo;
    String autor;
    int anio;

    Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
    }

    void cambiarAnio(int nuevoAnio) {
        this.anio = nuevoAnio;
    }
}

