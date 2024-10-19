package taller_segundo_momento;

public class Revista extends Material {
    int numeroEdicion;
    String mesPublicacion;
    
public Revista(String titulo, String autor, int añoPublicacion, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

 @Override
    public String getTipoMaterial() {
        return "Revista";
    }

@Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        return 0.5 * diasPrestamo; // tarifa base
    }

public void mostrarDetallesRevista() {
        mostrarInformacion();
        System.out.println("Número de Edición: " + numeroEdicion);
        System.out.println("Mes de Publicación: " + mesPublicacion);
    }
}
