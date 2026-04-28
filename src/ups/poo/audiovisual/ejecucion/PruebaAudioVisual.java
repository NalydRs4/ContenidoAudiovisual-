package ups.poo.audiovisual.ejecucion; 
//Paquete de -EJECUCIÓN- para probar las clases del paquete contenido.

import ups.poo.audiovisual.contenido.*;
//Se importan todas las clases del paquete contenido.
//Incluyen las instancias de Pelicula, SerieDeTV, Documental, Podcast, EventoDeportivo, Actor, Investigador, Invitado, Ganador, Circuito y Podio.

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Tarea #1 - Unidad 2. Relación entre Clases.");
        System.out.println("Elaborado por: .*.*.*.DYLAN TOTOY.*.*.*.");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Oppenheimer", 9.8286485, 180, "Biográfico, Bélico, Suspenso, Drama", "Universal Pictures", "Christopher Nolan");
        ((Pelicula) contenidos[0]).agregarActor(new Actor("Cillian Murphy"));
        ((Pelicula) contenidos[0]).agregarActor(new Actor("Emily Blunt"));
        ((Pelicula) contenidos[0]).agregarActor(new Actor("Matt Damon"));
        ((Pelicula) contenidos[0]).agregarActor(new Actor("Robert Downey Jr."));
        ((Pelicula) contenidos[0]).agregarActor(new Actor("Florence Pugh"));
        ((Pelicula) contenidos[0]).agregarActor(new Actor("Rami Malek"));
        contenidos[1] = new SerieDeTV("Breaking Bad", 50, "Drama criminal, Humor negro, Suspenso, Tragedia", "Sony Pictures Television, AMC", "Vince Gilligan", 5);
        ((SerieDeTV) contenidos[1]).agregarTemporada(1, 7);
        ((SerieDeTV) contenidos[1]).agregarTemporada(2, 13);
        ((SerieDeTV) contenidos[1]).agregarTemporada(3, 13);
        ((SerieDeTV) contenidos[1]).agregarTemporada(4, 13);
        ((SerieDeTV) contenidos[1]).agregarTemporada(5, 16);
        contenidos[2] = new Documental("Planeta Tierra", 90, "Naturaleza", "David Attenborough", "Vida salvaje");
         ((Documental) contenidos[2]).agregarInvestigador(new Investigador("David Attenborough"));
         ((Documental) contenidos[2]).agregarInvestigador(new Investigador("Jane Goodall"));
         ((Documental) contenidos[2]).agregarInvestigador(new Investigador("Sylvia Earle"));
         ((Documental) contenidos[2]).agregarInvestigador(new Investigador("E.O. Wilson"));
        contenidos[3] = new Podcast("The Wild Project", "NO estamos preparados para la CRISIS que viene", 198, "Geopolítica, Sociedad, Economía", "Jordi Wild", "Spotify");
         ((Podcast) contenidos[3]).agregarInvitado(new Invitado("Pablo Gil (Economista)"));
        contenidos[4] = new EventoDeportivo("Etihad Airways Gran Premio de Abu Dabi 2021", 82, "Automovilismo", "FIA", "Fórmula 1");
         ((EventoDeportivo) contenidos[4]).agregarGanador(new Ganador("Max Verstappen", "Red Bull Racing-Honda"));
         ((EventoDeportivo) contenidos[4]).agregarCircuito(new Circuito("Yas Marina Circuit (حلبة مرسى ياس)", "Abu Dabi - Emiratos Árabes Unidos", 153000));
         ((EventoDeportivo) contenidos[4]).agregarPodio("Lewis Hamilton", "Carlos Sainz Jr.", "Mercedes-AMG Petronas Formula One Team", "Scuderia Ferrari");
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}