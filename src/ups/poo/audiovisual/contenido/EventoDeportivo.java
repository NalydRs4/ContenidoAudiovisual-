package ups.poo.audiovisual.contenido;
// Paquete -CONTENIDO- audiovisual

import java.util.ArrayList;

// Subclase EventoDeportivo que HEREDA de ContenidoAudiovisual
public class EventoDeportivo extends ContenidoAudiovisual {
    private String deporte;
    private ArrayList<Circuito> circuitos;
    private ArrayList<Ganador> ganadores;
    private ArrayList<Podio> podios;
    // Clase Ganador - Circuito - relación por AGREGACIÓN.
    // Un evento deportivo tiene ganadores  y circuitos, pero estos pueden existir independientemente del evento deportivo.
    // Clase Podio - relación por COMPOSICIÓN.
    // Un evento deportivo tiene un podio, y el podio no puede existir sin el evento deportivo.

    public EventoDeportivo(String titulo, int duracionEnMinutos, String genero, String director, String deporte) {
        super(titulo, duracionEnMinutos, genero, director);
        this.deporte = deporte;
        this.circuitos = new ArrayList<>();
        this.podios = new ArrayList<>();
        this.ganadores = new ArrayList<>();
    }

    public String getDeporte() {
        return deporte;
    }

    // Método para establecer el deporte del evento deportivo.
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    // Métodos para agregar circuitos, ganadores y podios al evento deportivo.
    public void agregarCircuito(Circuito circuito) {
        this.circuitos.add(circuito);
    }

    public void agregarGanador(Ganador ganador) {
        this.ganadores.add(ganador);
    }

    public void agregarPodio(String nombre1, String nombre2, String equipo1, String equipo2) {
        Podio nuevoPodio = new Podio(nombre1, nombre2, equipo1, equipo2);
        this.podios.add(nuevoPodio);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del evento deportivo:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Deporte: " + deporte);
        System.out.println("Ganador: " + ganadores);
        System.out.println("Podio: " + this.podios);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Circuito: " + circuitos);  
        System.out.println();
    }

}
