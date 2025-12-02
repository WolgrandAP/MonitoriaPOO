package org.demo3.playmusic.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Playlist implements Serializable {

    private String titulo;
    private List<Musica> musicas;

    public Playlist() {}

    public Playlist(String nome, List<Musica> musicas) {
        this.titulo = nome;
        this.musicas = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public void adicionarMusica(Musica novaMusica) {
        for (Musica musicasNaPlaylist : musicas) {
            if (musicasNaPlaylist == novaMusica) {
                return;
            }
        }

        musicas.add(novaMusica);
    }

    public void removerMusica(Musica musicaRemovida) {
        for (Musica musicaNaPlaylist : musicas) {
            if (musicaNaPlaylist == musicaRemovida) {
                musicas.remove(musicaRemovida);
            }
        }
    }

}