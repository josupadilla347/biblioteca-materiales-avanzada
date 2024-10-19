package taller_segundo_momento;

public class Libro extends Material {

String isbn; 
int numeroPaginas;
    
    public Libro(String titulo, String autor, int añoPublicacion, String isbn, int numeroPaginas) {
        super(titulo, autor, añoPublicacion);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }
    @Override
    public String getTipoMaterial() {
        return "Libro";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 1.0;
        if (numeroPaginas > 500) {
            tarifaBase += 0.5; // recargo adicional
        }
        return tarifaBase * diasPrestamo;
    }

    public void mostrarDetallesLibro() {
        mostrarInformacion();
        System.out.println("ISBN: " + isbn);
        System.out.println("Número de Páginas: " + numeroPaginas);
    }
}
