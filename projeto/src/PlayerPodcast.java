public interface PlayerPodcast {
   public void playpodcast(Episodio episodio);
   public void playpodcast(Podcast podcast,Episodio episodio);
   public void playpodcast(PlaylistEpisodios playlist,Episodio episodio);
   public void pausePodcast(Episodio episodio);
   public void voltar15seg(Episodio episodio);
   public void avancar15seg(Episodio episodio);
   public void escolherVelocidade(Episodio episodio,double velocidade);
   public void  aumentarVolumeEpisodio(); 
   public void diminuirVolumeEpisodio();
   


}
