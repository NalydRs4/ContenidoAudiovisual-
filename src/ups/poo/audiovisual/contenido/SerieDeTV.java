package ups.poo.audiovisual.contenido;
//Paquete -CONTENIDO- audiovisual

import java.util.ArrayList;

//Subclase SerieDeTV que HEREDA de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private String estudio;
    private ArrayList<Temporada> listaTemporadas;
    //Clase Temporada - relación por COMPOSICIÓN.
    //Si se elimina la serie, sus temporadas dejan de existir.

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, String estudio, String director, int temporadas) {
        super(titulo, duracionEnMinutos, genero, director);
        this.temporadas = temporadas;
        this.estudio = estudio;
        this.listaTemporadas = new ArrayList<>();
    }

    //Método para agregar por composición una temporada a la serie de TV (número, episodios).
    public void agregarTemporada(int numero, int episodios) {
        Temporada nuevTemporada = new Temporada(numero, episodios);
        this.listaTemporadas.add(nuevTemporada);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Estudio: " + this.estudio);
        System.out.println("Duración promedio por episodio en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Temporadas: " + this.listaTemporadas);
        System.out.println("Creado por: " + getDirector());
        System.out.println();
    }
}