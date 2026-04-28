package ups.poo.audiovisual.contenido;
//Paquete -CONTENIDO- audiovisual

public class Invitado {
    private String nombre;

    public Invitado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //El método toString se sobrescribe para mostrar el nombre del invitado cuando se imprima el objeto.
    @Override
    public String toString() {
        return this.nombre;
    }
}
