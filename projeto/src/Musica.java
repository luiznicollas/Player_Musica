public class Musica {
    private Artista artista;
     private String nomeDaMusica;
     private String genero;
     private double duracao;
     

    public Musica(){
        
    }


    public Musica(Artista artista,String nomeDaMusica,String genero,double duracao){
            this.artista = artista;
            this.nomeDaMusica = nomeDaMusica;
            this.genero = genero;
            this.duracao = duracao;
            
    }

    public String getNome() {
        return nomeDaMusica;
    }

   
    public String getGenero() {
        return genero;
    }

 

    public double getDuracao() {
        return duracao;
    }

    public String getnomeArtista() {
        return artista.getNome();
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }


  
     
}
