package org.demo3.playmusic.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPlaylists implements Serializable {

    private List<Playlist> playlists;

    public GerenciadorPlaylists(List<Playlist> playlist) {
        this.playlists = new ArrayList<>();
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public void adicionarPlaylist(Playlist novaPlaylist) {
        for (Playlist playlistExistente : playlists) {
            if (!playlistExistente.getTitulo().equals(novaPlaylist.getTitulo())) {
                playlists.add(novaPlaylist);
            }
        }
    }

    public void removerPlaylist(Playlist playlistRemovida) {
        for (Playlist playlistExistente : playlists) {
            if (playlistExistente.getTitulo().equals(playlistRemovida.getTitulo())) {
                playlists.remove(playlistRemovida);
            }
        }
    }

    public Playlist buscarPlaylistPorNome(String nome) {

        Playlist playlistEncontrada = new Playlist();

        for (Playlist playlistExistente : playlists) {
            if (playlistExistente.getTitulo().equals(nome)) {
                playlistEncontrada = playlistExistente;
            }
        }
        return playlistEncontrada;
    }

}