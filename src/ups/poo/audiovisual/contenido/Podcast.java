package ups.poo.audiovisual.contenido;
//Paquete -CONTENIDO- audiovisual

import java.util.ArrayList;

// Subclase Podcast que HEREDA de ContenidoAudiovisual
public class Podcast extends ContenidoAudiovisual {
    private String plataforma;
    private String nombre;
    private ArrayList<Invitado> invitados;
    //Clase Invitado - relación por ASOCIACIÓN.
    // Un podcast tiene invitados, pero estos pueden existir independientemente del podcast.

    public Podcast(String nombre, String titulo, int duracionEnMinutos, String genero, String director, String plataforma) {
        super(titulo, duracionEnMinutos, genero, director);
        this.plataforma = plataforma;
        this.nombre = nombre;
        this.invitados = new ArrayList<>();
    }

    // Método para agregar un invitado al podcast.
    public void agregarInvitado(Invitado invitado) {
        this.invitados.add(invitado);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + nombre);
        System.out.println("Título: " + getTitulo());
        System.out.println("Invitados: " + invitados);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Dirección: " + getDirector());
        System.out.println();
    }

}
