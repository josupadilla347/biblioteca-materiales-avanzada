package taller_segundo_momento;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Crear materiales
        Libro libro1 = new Libro("El Quijote", "Cervantes", 1605, "123456789", 600);
        Revista revista1 = new Revista("National Geographic", "Varios", 2021, 5, "Mayo");
        AudioVisual audiovisual1 = new AudioVisual("Inception", "Nolan", 2010, "Blu-ray", 148);

        // Agregar materiales a la biblioteca
        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);
        biblioteca.agregarMaterial(audiovisual1);

        // Mostrar catálogo
        biblioteca.mostrarCatalogo();

        // Buscar material
        Material materialBuscado = biblioteca.buscarMaterial("El Quijote");
        if (materialBuscado != null) {
            System.out.println("Material encontrado:");
            materialBuscado.mostrarInformacion();
        }

        // Simular préstamo y devolución
        libro1.prestar();
        System.out.println("Después del préstamo:");
        libro1.mostrarInformacion();

        libro1.devolver();
        System.out.println("Después de la devolución:");
        libro1.mostrarInformacion();
    }
}
