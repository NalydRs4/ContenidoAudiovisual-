package ups.poo.audiovisual.contenido;
//Paquete -CONTENIDO- audiovisual

public abstract class ContenidoAudiovisual {
    private static int contar = 0;
    private String titulo;
    private int duracionEnMinutos;
    private String genero;
    private int id;
    private String director;
    //Clase Padre del paquete CONTENIDO. 
    // Con atributos comunes a todas las clases hijas (Película, Serie, Documental, Podcast, EventoDeportivo).

    public ContenidoAudiovisual(String titulo, int duracionEnMinutos, String genero, String director) {
        this.id = contar++;
        this.titulo = titulo;
        this.duracionEnMinutos = duracionEnMinutos;
        this.genero = genero;
        this.director = director;
    }

    // Getter y Setter para el campo 'titulo'
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Getter y Setter para el campo 'duracionEnMinutos'
    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    // Getter y Setter para el campo 'genero'
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // Getter para el campo 'id' (no se proporciona el Setter ya que 'id' se asigna en el constructor y parece ser inmutable)
    public int getId() {
        return id;
    }
    
    public String getDirector() {
        return director;
    }
    
    public abstract void mostrarDetalles();
}