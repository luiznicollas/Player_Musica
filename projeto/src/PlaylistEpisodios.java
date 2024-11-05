import java.util.ArrayList;

public class PlaylistEpisodios {
     private Usuario usuario;
     private String nome;
     private ArrayList<Episodio> playlistDeEpisodios;

public PlaylistEpisodios(){
    this.usuario = null;
    this.nome = null;
    this.playlistDeEpisodios = null;
    System.out.println("A playlist foi excluida ");
}

     public PlaylistEpisodios(Usuario usuario,String nome){
        this.usuario = usuario;
        this.nome = nome;
        this.playlistDeEpisodios = new ArrayList<>();
  }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getPlaylistDeEpisodios() {
        ArrayList<String> episodiosDaPlaylist =  new ArrayList<>();
         for(Episodio ep:playlistDeEpisodios){
            episodiosDaPlaylist.add(ep.getNome());
          }
        return episodiosDaPlaylist;
    }

    public void setPlaylistDeEpisodios(ArrayList<Episodio> playlistDeEpisodios) {
        this.playlistDeEpisodios = playlistDeEpisodios;
    }

    void adicionarNaPlaylistEpisodio(Episodio episodio){
        this.playlistDeEpisodios.add(episodio);

   }

  
   void removerDaPlaylistEpisodio(Episodio episodio){
        this.playlistDeEpisodios.remove(episodio);
   }

   public void mostrarEpisodios() {
    if (playlistDeEpisodios.isEmpty()) {
        System.out.println("A playlist está vazia.");
    } else {
        System.out.println("Episodios na playlist \"" + nome + "\":");
        for (Episodio elem : playlistDeEpisodios) {
            System.out.println(elem.getNome());
        }
      
    }
}
}
