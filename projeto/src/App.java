
public  class App {
   public static void main(String[] args) {

    Artista artista1 =  new Artista("Blink-182");
    Artista artista2 =  new Artista("Simple Plan");
    Artista artista3 = new Artista("Grupo Revelação");
    Artista artista4 = new Artista("Michael Jackson");
    Artista artista5 = new Artista("Jorge Vercillo");
    Artista artista6 = new Artista("Belo");
    Artista artista7 = new Artista("A-ha");
    


     // criando objetos musicas 
      Musica musica1 = new Musica(artista2, "Jet Lag", "punk", 3.24);
      Musica musica2 =  new Musica(artista3,"Baixa essa guarda","pagode",3.16);
      Musica musica3 = new Musica(artista4,"Thriller","Pop",5.57);
      Musica musica4 = new Musica(artista5,"Homem-Aranha","MPB",4.39);
      Musica musica5 = new Musica(artista6,"Perfume","Pagode",3.53);
      Musica musica6 =  new Musica(artista7,"Take on me","Pop",3.45);
    
     // objetos musicas que são do blink-182 
     Musica musica7 = new Musica(artista1, "Dumpweed", "punk", 3.24);
     Musica musica8 =  new Musica(artista1,"Don' t leave Me ","pagode",3.16);
     Musica musica9 = new Musica(artista1,"Aliens Exist","Pop",5.57);
     Musica musica10 = new Musica(artista1,"Going Away to College","MPB",4.39);
     Musica musica11 = new Musica(artista1,"What's My Age Again?","Pagode",3.53);
     Musica musica12 =  new Musica(artista1,"Dysantary Gary","Pop",3.45);
     Musica musica13 = new Musica(artista1, "Adam's song", "punk", 3.24);
     Musica musica14 =  new Musica(artista1,"All the Small Things","pagode",3.16);
     Musica musica15 = new Musica(artista1,"The Party Song","Pop",5.57);
     Musica musica16 = new Musica(artista1,"Mutt","MPB",4.39);
     Musica musica17 = new Musica(artista1,"Wendy Clear","Pagode",3.53);
     Musica musica18 =  new Musica(artista1,"Anthem","Pop",3.45);
    
     // criando o objeto album
     Album album = new Album(artista1, "Enema of the State", 12);
    
      album.adicionarMusicaAlbum(musica7);
      album.adicionarMusicaAlbum(musica8);
      album.adicionarMusicaAlbum(musica9);
      album.adicionarMusicaAlbum(musica10);
      album.adicionarMusicaAlbum(musica11);
      album.adicionarMusicaAlbum(musica12);
      album.adicionarMusicaAlbum(musica13);
      album.adicionarMusicaAlbum(musica14);
      album.adicionarMusicaAlbum(musica15);
      album.adicionarMusicaAlbum(musica16);
      album.adicionarMusicaAlbum(musica17);
      album.adicionarMusicaAlbum(musica18);

      // criando os objetos podcast
      Podcast podcast1 = new Podcast("Esqueletos em Twin Peaks", "Cinema", "fulano");
      Podcast podcast2 = new Podcast("TLTCast", "Livros", "Tatiana Feltrin");
      Podcast podcast3 = new Podcast("Modus Operandi","True crime","Carol Moreira");
      Podcast podcast4 = new Podcast("Inglês do Zero","Educação","Teacher Jay");





      Episodio episodio1 = new Episodio(podcast1, "Piloto", "Atenção it girls....", 56, 28);
      Episodio episodio2 = new Episodio(podcast1, "Traces to Nowhere", "Este é o esqueleto em Twin Peaks", 34, 19);
      Episodio episodio3 = new Episodio(podcast1, "Rest in Pain", "Este é o esqueleto em Twin Peaks", 26, 28);
      Episodio episodio4 = new Episodio(podcast2,"Livros dificeis de Largar","Uma lista de livros",59,21);
      Episodio episodio5 = new Episodio(podcast2,"Conversa de bar","Respondendo perguntas",52,16);
      Episodio episodio6 =  new Episodio(podcast3, "Varios Casos de Halloween", "Casos que aconteceram no Halloween", 52, 24);
      Episodio episodio7 = new Episodio(podcast4,"Verb to be","vamos aprender verb to be",17,18);


      podcast1.adicionarEpsPodcast(episodio1);
      podcast1.adicionarEpsPodcast(episodio2);
      podcast1.adicionarEpsPodcast(episodio3);
      podcast2.adicionarEpsPodcast(episodio4);
      podcast2.adicionarEpsPodcast(episodio5);
      podcast3.adicionarEpsPodcast(episodio6);
      podcast4.adicionarEpsPodcast(episodio7);



     
      



  // criando os objetos planos de assinatura
      Individual plano1 = new Individual();
      Duo plano2 =  new Duo();
      Familia plano3 = new Familia();
      Universitario plano4 = new Universitario();



      // criando o objeto usuário

      Usuario usuario1 = new Usuario("Nicollas","123","lncmps");


      // assinando um plano de assinatura 

      usuario1.assinarPlano(plano3);
       



       // criando os os players pra controlar as musicas,episodios,playlists e albuns
       ClassePlayerMusica  playerMusica = new ClassePlayerMusica();
       ClassePlayerPodcast playerPodcast =  new ClassePlayerPodcast();
      
       
      //playerPodcast.playpodcast(episodio1);
      //playerPodcast.pausePodcast(podcast1, episodio1);

      // criando as playlists de musicas e episodios de podcasts
      PlaylistMusica playlistMusicas1 = new PlaylistMusica(usuario1,"Minha primeira Playlist" );

      PlaylistEpisodios playlistPodcasts = new PlaylistEpisodios(usuario1,"Meus eps dos podcasts");

      // adicionando musicas a playlist 
       playlistMusicas1.adicionarNaPlaylistMusica(musica9);
       playlistMusicas1.adicionarNaPlaylistMusica(musica17);
       playlistMusicas1.adicionarNaPlaylistMusica(musica7);
       playlistMusicas1.adicionarNaPlaylistMusica(musica2);

       // adicionando episodios de podcasts a playlist

       playlistPodcasts.adicionarNaPlaylistEpisodio(episodio1);
       playlistPodcasts.adicionarNaPlaylistEpisodio(episodio2);
       playlistPodcasts.adicionarNaPlaylistEpisodio(episodio7);



      playerMusica.play(musica9);

      playerPodcast.playpodcast(episodio7);
      playerPodcast.pausePodcast(episodio7);
      playerPodcast.escolherVelocidade(episodio7, 2);
      playerPodcast.playpodcast(podcast1, episodio7);
    

       usuario1.mostrarSeguindoPodcasts();
       usuario1.seguirPodcast(podcast4);
       usuario1.mostrarSeguindoPodcasts();

       
       System.out.println(usuario1.getPlano());
      
      

     //playerPodcast.playpodcast(playlistPodcasts,episodio2);
     
     //playlistPodcasts.mostrarEpisodios();

     //playlistPodcasts.adicionarNaPlaylistEpisodio(episodio1);
    // playlistPodcasts.mostrarEpisodios();


   

   
    

     
      
     

 

      
  
   }
 





 }
   
 


