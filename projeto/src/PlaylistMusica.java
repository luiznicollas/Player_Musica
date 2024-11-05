
import java.util.ArrayList;


public class PlaylistMusica {
     private Usuario usuario;
     private String nome;
     private ArrayList<Musica> minhaplaylist;

        public PlaylistMusica(Usuario usuario,String nome){
              this.usuario = usuario;
              this.nome = nome;
              this.minhaplaylist = new ArrayList<>();
        }

    
     void adicionarNaPlaylistMusica(Musica umaMusica){
          this.minhaplaylist.add(umaMusica);

     }

    
     void removerDaPlaylistMusica(Musica umaMusica){
          this.minhaplaylist.remove(umaMusica);
     }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
   
    public void mostrarMusicas() {
        if (minhaplaylist.isEmpty()) {
            System.out.println("A playlist está vazia.");
        } else {
            System.out.println("Músicas na playlist \"" + nome + "\":");
            for (Musica musica : minhaplaylist) {
                System.out.println(musica.getNome() + " - " + musica.getnomeArtista());
            }
          
        }
    }

    public ArrayList<String> getMinhaplaylist() {
        ArrayList<String> lista = new ArrayList<>();

           for(Musica elem:minhaplaylist){
             lista.add(elem.getNome());
           }
        return lista;
    }

    public void setMinhaplaylist(ArrayList<Musica> minhaplaylist) {
        this.minhaplaylist = minhaplaylist;
    }

  
   public void excluirPlaylistMusica(PlaylistMusica playlist){
            playlist.setUsuario(null);
            playlist.setNome(null);
            playlist.setMinhaplaylist(null);

           System.out.println("Playlist excluida");
            

   }


}
   


