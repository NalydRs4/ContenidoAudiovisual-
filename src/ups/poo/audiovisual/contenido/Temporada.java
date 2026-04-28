package ups.poo.audiovisual.contenido;
//Paquete -CONTENIDO- audiovisual

public class Temporada {
    private int numero;
    private int episodios;

    public Temporada(int numero, int episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //El método toString se sobrescribe para mostrar el número de temporada y la cantidad de episodios cuando se imprima el objeto.
    @Override
    public String toString() {
        return "Temporada " + numero + " : " + episodios + " episodios";
    }

}
