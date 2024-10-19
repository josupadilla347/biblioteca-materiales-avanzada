package taller_segundo_momento;

public abstract class Material {
String titulo;
String autor; 
int añoPublicacion; 
boolean disponible; 

public Material (String titulo, String autor, int añoPublicacion){
    this.titulo = titulo;
    this.autor = autor;
    this.añoPublicacion = añoPublicacion;
    this.disponible = true;

}

public void mostrarInformacion (){
System.out.println("El titulo es: " + titulo);
System.out.println("El autor es: " + autor);
System.out.println("El año de publicacion es: " + añoPublicacion);
System.out.println("Disponibilidad" + disponible);
}

public void prestar() {
    this.disponible = false;
}
public void devolver() {
    this.disponible = true;
}
public abstract String getTipoMaterial();
    
public abstract double calcularTarifaPrestamo(int diasPrestamo);

}
