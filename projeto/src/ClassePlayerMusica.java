import java.util.ArrayList;

public class ClassePlayerMusica implements PlayerMusica {
  
    @Override
     public  void  play(Musica musica){
        System.out.println(" A musica "+ musica.getNome() +" está tocando ");
    }

    @Override
     public void  play(Album album, Musica musica){
        ArrayList<String> musicas = new ArrayList<>();
         musicas = album.getMusicasDoAlbum();
         boolean musicaEncontrada = false;

        for (String m : album.getMusicasDoAlbum()) { // Verifica objetos Musica em vez de Strings
            if (m.equals(musica.getNome())) { // Compara o nome da música
                System.out.println("A música " + musica.getNome() + " está tocando.");
                musicaEncontrada = true;
                break;
            }
        }

        if (!musicaEncontrada) {
            System.out.println("A música " + musica.getNome() + " não está no álbum " + album.getNome() + ".");
        }
    }
    

    @Override
    public void play(PlaylistMusica playlist,Musica musica){
        // a gente pode colocar tratamento de exceção 
        ArrayList<String> musicas = new ArrayList<>();
        musicas = playlist.getMinhaplaylist();
        boolean musicaEncontrada = false;

       for (String m : playlist.getMinhaplaylist()) { // Verifica objetos Musica em vez de Strings
           if (m.equals(musica.getNome())) { // Compara o nome da música
               System.out.println("A música " + musica.getNome() + " está tocando.");
               musicaEncontrada = true;
               break;
           }
       }

       if (!musicaEncontrada) {
           System.out.println("A música " + musica.getNome() + " não está no álbum " + playlist.getNome() + ".");
       }
    }

    @Override
    public   void pause (Musica musica){
        System.out.println(" A musica "+ musica.getNome() +" está pausada ");
    }

    @Override
    public  void  loop(Musica musica){
        System.out.println("A musica " + musica.getNome()+ " vai ser repetida ");
    }

    @Override
    public  void  escolhaAleatória(){
          System.out.println("As musicas vão ser escolhidas de forma aleatória");
    }

    @Override
    public void  aumentarVolume(){
        System.out.println("Aumentando volume");
    }

    @Override
    public void diminuirVolume(){
        System.out.println("Diminuindo volume");
    }

  
   
   


}
