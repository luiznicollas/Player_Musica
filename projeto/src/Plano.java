public abstract class  Plano {
     
     private String nome;
     private double preco;
     private int duracao; // stand by

  public Plano(){

  }

  public Plano(String nome,double preco){
        this.nome = nome;
        this.preco = preco;
  }

  public Plano(String nome){
       this.nome = nome;
  }

     public Plano(String nome,double preco,int duracao){
          this.nome = nome;
          this.preco= preco;
          this.duracao = duracao;


     }


    public String getNome() {
        return nome;
    }

    public void setNome(String tipo) {
        this.nome = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }




   
    






     


}
