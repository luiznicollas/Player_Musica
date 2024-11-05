
import java.util.ArrayList;

public class Album {
    private Artista artista;
    private String nome;
    private int quantidadeDeMusicas;
    private ArrayList<Musica> musicasDoAlbum;


    public Album(Artista artista,String nome,int quantidadeDeMusicas){
        this.artista = artista;
        this.nome = nome;
        this.quantidadeDeMusicas= quantidadeDeMusicas;
        this.musicasDoAlbum = new ArrayList<>();

    }
    

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDeMusicas() {
        return quantidadeDeMusicas;
    }

  
    public void adicionarMusicaAlbum(Musica musica){
             musicasDoAlbum.add(musica);
    }

   public void mostrarMusicasAlbum(){
        System.out.println("Musicas do album de " + artista.getNome() + ":" +getNome() );
             for (Musica elem : musicasDoAlbum) {
                 System.out.println(" - " + elem.getNome());
             }
   }

    public ArrayList<String> getMusicasDoAlbum() {

           ArrayList<String> lista = new ArrayList<>();

           for(Musica elem:musicasDoAlbum){
             lista.add(elem.getNome());
           }
        return lista;
    }

    public void setMusicasDoAlbum(ArrayList<Musica> musicasDoAlbum) {
        this.musicasDoAlbum = musicasDoAlbum;
    }


 
}



