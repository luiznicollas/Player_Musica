import java.util.ArrayList;

public class ClassePlayerPodcast implements PlayerPodcast{



     @Override
    public void playpodcast(Episodio episodio){
            System.out.println("O episodio " + episodio.getNome() + " esta tocando ");
    }

    @Override
    public void playpodcast(Podcast podcast,Episodio episodio){
         ArrayList<String> episodiospodcast = new ArrayList<>();
         episodiospodcast = podcast.getEpisodios();
         boolean episodioEncontrado = false;

          for (String e : episodiospodcast) {
              if(e.equals(episodio.getNome())){
                 System.out.println(" O episodio " + episodio.getNome() +"Do" + podcast.getNome() + "está tocando ");
                 episodioEncontrado = true;
                 break;
              }
              
          }
        if(!episodioEncontrado){
           System.out.println("O episodio " + episodio.getNome() + " Não está no podcast " + podcast.getNome());
        }
    }
    @Override
    public void playpodcast(PlaylistEpisodios playlist,Episodio episodio){
      ArrayList<String> playlistEpsPodcast = new ArrayList<>();
         playlistEpsPodcast = playlist.getPlaylistDeEpisodios();
        boolean episodioEncontrado = false;

         for (String e : playlistEpsPodcast) {
             if(e.equals(episodio.getNome())){
                System.out.println(" O episodio " + episodio.getNome() +"Da" + playlist.getNome() + "está tocando ");
                episodioEncontrado = true;
                break;
             }
             
         }
       if(!episodioEncontrado){
          System.out.println("O episodio " + episodio.getNome() + " Não está no podcast " + playlist.getNome());
       }
    }

   @Override
   public void pausePodcast(Episodio episodio){
        System.out.println(" O  episodio " + episodio.getNome() +  " está pausado ");
   }
   @Override
   public void avancar15seg(Episodio episodio){
        System.out.println("Avançando 15 segundos do  episodio " + episodio.getNome());
   }
   @Override
   public void voltar15seg(Episodio episodio){
    System.out.println("Voltando 15 segundos do episodio " + episodio.getNome());
      
   }
   @Override

   public void escolherVelocidade(Episodio episodio,double velocidade){
          System.out.println(" O episodio " + episodio.getNome() + " está na velocidade " + velocidade+"x");
   }  
   
   @Override
   public void  aumentarVolumeEpisodio(){
       System.out.println("Aumentando volume");
   }

   @Override
   public void diminuirVolumeEpisodio(){
       System.out.println("Diminuindo volume");
   }


 
}
