package ups.poo.audiovisual.contenido;
//Paquete -CONTENIDO- audiovisual

public class Ganador {
    private String nombre;
    private String scuderia;

    public Ganador(String nombre, String scuderia) {
        this.nombre = nombre;
        this.scuderia = scuderia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getScuderia() {
        return scuderia;
    }

    public void setScuderia(String scuderia) {
        this.scuderia = scuderia;
    }
    
    // El método toString se sobrescribe para mostrar el nombre del ganador y su scuderia cuando se imprima el objeto.
    @Override
    public String toString() {
        return this.nombre + " - " + this.scuderia;
    }
}
