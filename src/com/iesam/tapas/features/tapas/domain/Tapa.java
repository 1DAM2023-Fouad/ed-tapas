package com.iesam.tapas.features.tapas.domain;

public class Tapa {

    //Atributos
    public  final String id;
    private final String nombre;
    private final String nombreEstablecimiento;
    private final String totalPuntos;
    private final String mediaVotos;
    private final String numeroParticipantes;
    private final String totalVotos;
    private final String ingredientes;

    //Constructor
    public Tapa(String id, String nombre, String nombreEstablecimiento, String totalPuntos, String mediaVotos, String numeroParticipantes, String totalVotos, String ingredientes) {
        this.id=id;
        this.nombre = nombre;
        this.nombreEstablecimiento = nombreEstablecimiento;
        this.totalPuntos = totalPuntos;
        this.mediaVotos = mediaVotos;
        this.numeroParticipantes = numeroParticipantes;
        this.totalVotos = totalVotos;
        this.ingredientes = ingredientes;
    }

    /*
    * Al poner final, el método set no funciona, también ponemos el atributo id en publico
    * para que en TapaDataRepository pueda acceder a el*/

    //toString

    @Override
    public String toString() {
        return "\n Tapa " +
                "\n ID = " + id  +
                "\n NOMBRE = " + nombre +
                "\n NOMBRE ESTABLECIMIENTO = " + nombreEstablecimiento +
                "\n TOTAL PUNTOS = " + totalPuntos +
                "\n MEDIA VOTOS = " + mediaVotos +
                "\n NÚMERO PARTICIPANTES = " + numeroParticipantes +
                "\n TOTAL VOTOS = " + totalVotos +
                "\n INGREDIENTES = " + ingredientes + "\n";
    }
}
