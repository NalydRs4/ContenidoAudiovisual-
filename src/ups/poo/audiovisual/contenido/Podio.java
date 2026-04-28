package ups.poo.audiovisual.contenido;
//Paquete -CONTENIDO- audiovisual

public class Podio {
    private String nombre1;
    private String nombre2;
    private String scuderia1;
    private String scuderia2;

    public Podio(String nombre1, String nombre2, String scuderia1, String scuderia2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.scuderia1 = scuderia1;
        this.scuderia2 = scuderia2;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getScuderia1() {
        return scuderia1;
    }

    public void setScuderia1(String scuderia1) {
        this.scuderia1 = scuderia1;
    }

    public String getScuderia2() {
        return scuderia2;
    }

    public void setScuderia2(String scuderia2) {
        this.scuderia2 = scuderia2;
    }

    //El método toString se sobrescribe para mostrar el nombre y scuderia de los ganadores del podio cuando se imprima el objeto.
    @Override
    public String toString() {
        return this.nombre1 + " - " + this.scuderia1 + " | " + this.nombre2 + " - " + this.scuderia2;
    }
}
