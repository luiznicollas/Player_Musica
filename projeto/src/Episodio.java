public class Episodio {
   private Podcast podcast;
   private String nome;
   private String sinopse; // stand by 
   private double duracao;
   private int dataLancamento;

   public Episodio(Podcast podcast,String nome,String sinopse,double duracao,int dataLancamento){
         this.podcast = podcast;
         this.nome = nome;
         this.sinopse = sinopse;
         this.duracao =  duracao;
         this.dataLancamento = dataLancamento;

   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(int dataLancamento) {
        this.dataLancamento = dataLancamento;
    }




}
