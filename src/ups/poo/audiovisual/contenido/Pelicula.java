package ups.poo.audiovisual.contenido;
//Paquete -CONTENIDO- audiovisual

import java.util.ArrayList;

// Subclase Pelicula que HEREDA de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private double recaudacion;
    private String estudio;
    private ArrayList<Actor> actores;
    //Clase Actor - relación por AGREGACIÓN. 
    //Si se elimina la pelicula, los actores asociados siguen existiendo y no se eliminan.

    public Pelicula(String titulo, double recaudacion, int duracionEnMinutos, String genero, String estudio, String director) {
        super(titulo, duracionEnMinutos, genero, director);
        this.recaudacion = recaudacion;
        this.estudio = estudio;
        this.actores = new ArrayList<>();
    }

    // Método para agregar un actor a la película.
    public void agregarActor(Actor actor) {
        this.actores.add(actor);
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Recaudación: " + recaudacion + " millones de dólares");
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println("Reparto: " + actores);
        System.out.println("Dirección: " + getDirector());
        System.out.println();
    }
}