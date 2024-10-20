package taller_segundo_momento;

public class AudioVisual extends Material {
    private String formato;
    private int duracion;

    public AudioVisual(String titulo, String autor, int añoPublicacion, String formato, int duracion) {
        super(titulo, autor, añoPublicacion);
        this.formato = formato;
        this.duracion = duracion;
    }

    @Override
    public String getTipoMaterial() {
        return "Audiovisual";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 1.5;
        if ("Blu-ray".equalsIgnoreCase(formato)) {
            tarifaBase += 0.5; // recargo adicional
        }
        return tarifaBase * diasPrestamo;
    }

    public void mostrarDetallesAudiovisual() {
        mostrarInformacion();
        System.out.println("Formato: " + formato);
        System.out.println("Duración: " + duracion + " minutos");
    }
}

