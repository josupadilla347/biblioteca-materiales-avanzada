package taller_segundo_momento;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Material> materiales;

    public Biblioteca() {
        this.materiales = new ArrayList<>();
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    public Material buscarMaterial(String titulo) {
        for (Material material : materiales) {
            if (material.getTipoMaterial().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null;
    }

    public void mostrarCatalogo() {
        for (Material material : materiales) {
            material.mostrarInformacion();
            System.out.println("Tipo de Material: " + material.getTipoMaterial());
            System.out.println();
        }
    }
}
