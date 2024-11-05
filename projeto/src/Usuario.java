
import java.util.ArrayList;

public class Usuario {
  private String nome;
  private String senha;
  private String username;
  private Plano plano;
  private ArrayList<Artista> seguindoArtistas;
  private ArrayList<Podcast> seguindoPodcasts;
  private ArrayList<PlaylistMusica> ListaDePlaylists;
  private ArrayList<PlaylistEpisodios> ListaDePlaylistEpisodios;
  



  public Usuario(String nome, String senha,String username){
      this.nome = nome;
      this.senha = senha;
      this.username = username;
      this.plano = new Free();
      this.seguindoArtistas = new ArrayList<>();
      this.seguindoPodcasts = new ArrayList<>();
      this.ListaDePlaylists = new ArrayList<>();
      this.ListaDePlaylistEpisodios =  new ArrayList<>();
  }

  public void seguirArtista(Artista artista){
           seguindoArtistas.add(artista);
           System.out.println("você agora segue o " + artista.getNome());
    
  }

  public void seguirPodcast(Podcast podcast){
       seguindoPodcasts.add(podcast);
       System.out.println("Você agora segue o " + podcast.getNome());
  }

  public void mostrarSeguindoArtistas(){
    if (seguindoArtistas.isEmpty()){
       System.out.println("Você não segue nenhum artista");
    }
    else{
    System.out.println("O usuario segue os artistas : ");
    for(Artista elemento: seguindoArtistas){
         System.out.println(elemento.getNome());
  }
}
} 

public void mostrarSeguindoPodcasts(){
  if(seguindoPodcasts.isEmpty()){
    System.out.println("O usuario não segue nenhum podcast");
  }
  else{
    System.out.println("O usuario segue os podcasts : ");
  for(Podcast elemento: seguindoPodcasts){
       System.out.println(elemento.getNome());
}
  }
} 


public void adicionarAoPerfil(PlaylistMusica playlist){
      ListaDePlaylists.add(playlist);
}


public void mostrarSuasPlaylists(){
  System.out.println("As Playlists do Usuário : ");
  for (PlaylistMusica elem : ListaDePlaylists) {
         System.out.println(elem.getNome());
  }
}

public void assinarPlano(Plano plano ){
   setPlano(plano);
  System.out.println("Voce agora é assinante do plano " + plano.getNome() + " pagando " + plano.getPreco());
}



public void cancelarPlano(Plano plano){
  Plano deVoltaFree = new Free();
  setPlano(deVoltaFree);

  System.out.println("Voce não é mais assinante do plano " + plano.getNome());
}

    public String getPlano() {
        return  "O seu plano é: " + plano.getNome();
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ArrayList<Artista> getSeguindoArtistas() {
        return seguindoArtistas;
    }

    public void setSeguindoArtistas(ArrayList<Artista> seguindoArtistas) {
        this.seguindoArtistas = seguindoArtistas;
    }

    public ArrayList<Podcast> getSeguindoPodcasts() {
        return seguindoPodcasts;
    }

    public void setSeguindoPodcasts(ArrayList<Podcast> seguindoPodcasts) {
        this.seguindoPodcasts = seguindoPodcasts;
    }

    public ArrayList<PlaylistMusica> getListaDePlaylists() {
        return ListaDePlaylists;
    }

    public void setListaDePlaylists(ArrayList<PlaylistMusica> ListaDePlaylists) {
        this.ListaDePlaylists = ListaDePlaylists;
    }

    public ArrayList<PlaylistEpisodios> getListaDePlaylistEpisodios() {
        return ListaDePlaylistEpisodios;
    }

    public void setListaDePlaylistEpisodios(ArrayList<PlaylistEpisodios> ListaDePlaylistEpisodios) {
        this.ListaDePlaylistEpisodios = ListaDePlaylistEpisodios;
    }


}
