package Encuesta;

import java.util.ArrayList;
import java.util.List;

public class Encuesta {
    private List<String> preguntas;
    private List<String> respuestas;

    public Encuesta() {
        preguntas = new ArrayList<>();
        respuestas = new ArrayList<>();
        cargarPreguntas();
    }

    private void cargarPreguntas() {
        preguntas.add("¿Cuál es tu canción favorita de BTS?");
        preguntas.add("¿Desde qué año eres fan de BTS?");
        preguntas.add("¿Tienes algún miembro favorito de BTS? ¿Quién?");
        preguntas.add("¿Has asistido alguna vez a un concierto de BTS?");
        preguntas.add("¿Cómo te sientes al ser parte del fandom de ARMY?");
    }

    public List<String> getPreguntas() { return preguntas; }
    public void agregarRespuesta(String respuesta) { respuestas.add(respuesta); }
    public List<String> getRespuestas() { return respuestas; }
}
