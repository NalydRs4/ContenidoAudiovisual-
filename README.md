# ContenidoAudiovisual

*Programación Orientada a Objetos*

**#Tarea 2:** Relación entre Clases

**Propósito:**

Mejorar el dominio de conocimientos sobre la Programación Orientada a Objetos a través de la ampliación e incorporación de clases, la elaboración de diagramas de clases y la adecuada aplicación de relaciones entre clases, así como la administración y clonación de proyectos en GitHub.

**Objetivos:**

- Incorporar nuevas clases al proyecto original (ContenidoAudiovisual) y utilizar apropiadamente las relaciones de herencia, asociación, agregación y composición.
- Continuar con la elaboración de los diagramas de las clases a travez de PlantUML, donde se debe ilustrar de manera visual la organización, las propiedades y las interacciones entre las clases y subclases del proyecto.
- Implementar flujos de trabajo a través de GitHub para optimizar la gestión y el mantenimiento de proyectos.

**Clases y funcionalidades nuevas:**

- Actor: Relacionada con Película (**AGREGACIÓN**).
- Temporada: Relacionada con SerieDeTV (**COMPOSICIÓN**).
- Investigador: Relacionada con Documental (**AGREGACIÓN**).
- Invitado: Relacionada con Podcast (**ASOCIACIÓN**). 
- Circuito y Ganador: Relacionada con EventoDeportivo (**AGREGACIÓN**).
- Podio: Relacionada con EventoDeportivo (**COMPOSICIÓN**).

**Diagrama de clases:**

<img width="1581" height="1776" alt="AGREGACIÓN" src="https://github.com/user-attachments/assets/8be414df-13ec-438e-bb99-320a1b689515" />

**Mejoras adicionales:**

Optimice el código, reestructuré los paqutes del proyecto, agregué y relacioné nuevas clases a las subcalses originales del proyecto como: Director, Presupuesto, etc.

- Para **Temporada : SerieDeTV** voy a establecer un vínculo de *COMPOSICIÓN* ya que, al suprimirse la serie, sus respectivas temporadas igualmente dejarian de existir sin ella.
- Para la clase **Actor : Película e Investigador : Documental** establezco el vínculo de *AGREGACIÓN*, dado que en el caso de que la película o el documental sean eliminados, los actores y los investigadores vinculados pueden existir de manera independiente.
- Clase **Invitado : Podcast** con vínculo de *ASOCIACIÓN* en relación a un Podcast, dado que un podcast puede contar con invitados o no, y estos pueden existir de manera independiente al podcast.
- Clases **Ganador - Circuito : EventoDeportivo** con relación de *AGREGACIÓN*, dado que en el caso de que el EventoDeportivo sea eliminado, los circuitos y el ganador vinculado pueden existir de manera independiente del evento deportivo.
- Clase **Podio : EventoDeportivo**, con una relación de *COMPOSICIÓN*, ya que al eliminar el evento deportivo, el podio dejaría de existir sin el.

**Estructura de Carpetas:** 

src/ups/poo/audiovisual/contenido - ejecucion

<img width="288" height="379" alt="Pasted image" src="https://github.com/user-attachments/assets/aecdefdc-fea1-493f-b020-28109f5d21a0" />

- src/: Carpeta que contiene el código fuente de la aplicación.
- audiovisual/: Carpeta que contiene **contenido** (*clases y sublases*) y **ejecucion** (*main para ejecutar el proyecto*).

**Instrucciones de Instalación:**

- Copiar el enlace HTTPS: **https://github.com/NalydRs4/ContenidoAudiovisual-.git**
- Abrir nuevo espacio de trabajo en el programa a clonar y seleccionar Clonar Repositorio Git y pegar el enlace HTTPS.
  
<img width="1366" height="768" alt="Pasted image (2)" src="https://github.com/user-attachments/assets/71b2cb78-0ba6-42ac-a9dc-b19f315992c6" />

- Tendrá dos paquetes al final, uno llamado *CONTENIDO* donde se encuentran las subclases Pelicula, Actor, ContenidoAudioVisual, etc.
- El otro paquete será *EJECUCION* donde tendrá la clase PruebaAudioVisual para poder ejecutar el proyecto y manipular las clases.

 <img width="1366" height="768" alt="Pasted image (3)" src="https://github.com/user-attachments/assets/168e7f09-736e-492d-90df-5c03d92017eb" />

