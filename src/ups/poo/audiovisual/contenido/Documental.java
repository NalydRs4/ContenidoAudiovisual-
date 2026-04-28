package ups.poo.audiovisual.contenido;
//Paquete -CONTENIDO- audiovisual

import java.util.ArrayList;

// Subclase Documental que Hereda de ContenidoAudiovisual.
public class Documental extends ContenidoAudiovisual {
    private String tema;
    private ArrayList<Investigador> investigadores;
    // Clase Investigador - relación de AGREGACIÓN.
    // Un documental puede tener varios investigadores asociados, pero pueden existir independientemente del documental.

    public Documental(String titulo, int duracionEnMinutos, String genero, String director, String tema) {
        super(titulo, duracionEnMinutos, genero, director);
        this.tema = tema;
        this.investigadores = new ArrayList<>();
    }
    // Método para agregar un investigador al documental.
    public void agregarInvestigador(Investigador investigador) {
        this.investigadores.add(investigador);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println("Investigadores: " + investigadores);
        System.out.println("Dirección: " + getDirector());
        System.out.println();
    }
}