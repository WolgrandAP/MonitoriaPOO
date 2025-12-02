package org.demo3.playmusic.model;

import java.io.Serializable;

public class Musica implements Serializable {

    private String titulo;
    private String artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return String.format("Música: Nome - %s / Artista - %s", this.getTitulo(), this.getArtista());
    }
}