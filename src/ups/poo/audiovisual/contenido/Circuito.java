package ups.poo.audiovisual.contenido;
//Paquete -CONTENIDO- audiovisual

public class Circuito {
    private String nombre;
    private String ubicacion;
    private int asistencia;

    public Circuito(String nombre, String ubicacion, int asistencia) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.asistencia = asistencia;
    }
    
    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    // El método toString se sobrescribe para mostrar el nombre, ubicación y asistencia del circuito cuando se imprima el objeto.
    @Override
    public String toString() {
        return this.nombre + " - " + this.ubicacion + " (Asistencia: " + this.asistencia + ")";
    }

}
