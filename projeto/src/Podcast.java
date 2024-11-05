
import java.util.ArrayList;

public class Podcast {
  
  private String nome;
  private String categoria;
  private String apresentador;
  private ArrayList<Episodio> episodios;

  public Podcast(String nome,String categoria,String apresentador){
         this.nome = nome;
         this.categoria = categoria;
         this.apresentador = apresentador;
         this.episodios =  new ArrayList<>();
  }


  
  public void sobrePodcast(){}

    public ArrayList<String> getEpisodios() {
        ArrayList<String> lista = new ArrayList<>();

           for(Episodio ep:episodios){
             lista.add(ep.getNome());
           }
        return lista;
    }

    public void setEpisodios(ArrayList<Episodio> episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void adicionarEpsPodcast(Episodio episodio){
            this.episodios.add(episodio);
    }
    
    }









