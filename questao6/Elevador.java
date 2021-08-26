public class Elevador{
  private int andarAtual = 0;
  private int totalAndares;
  private int capacidade;
  private int pessoasPresentes = 0;
  private int andarSubir;
  private int andarDescer;

  public Elevador(int totalAndares, int capacidade){
    this.totalAndares = totalAndares;
    this.capacidade = capacidade; 
  }

  //gets e sets
  public int getAndarAtual(){
    return andarAtual;
  }
  public void setAndarAtual(int andarAtual){
    this.andarAtual = andarAtual;
  }

  public int getTotalAndares(){
    return totalAndares;
  }
  public void setTotalAndares(int totalAndares){
    this.totalAndares = totalAndares;
  }

  public int getCapacidade(){
    return capacidade;
  }
  public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
  }

  public int getPessoasPresentes(){
    return pessoasPresentes;
  }
  public void setPessoasPresentes(int pessoasPresentes){
    this.pessoasPresentes = pessoasPresentes;
  }

  //método toString TERMINAR
  public String toString(){
    return "Andar atual: " + andarAtual + "\n" + 
    "Total de andares: " + totalAndares + "\n" +
    "Capacidade do elevador: " + capacidade + "\n" +
    "Pessoas presentes no elevador: " + pessoasPresentes;
  }

  //método entra
  public String entrar(){
    if(pessoasPresentes<capacidade){
      pessoasPresentes += 1;
    }
    return "Uma pessoa entrou no elevador. Total de pessoas: " + pessoasPresentes;
  }

  //método sai
  public String sair(){
    if(pessoasPresentes>0){
      pessoasPresentes -= 1;
    }
    return "Uma pessoa saiu do elevador. Total de pessoas: " + pessoasPresentes;
  }

  //método sobe
  public void sobe(int andarSubir){
    this.andarSubir = andarSubir;
    if(andarSubir < totalAndares & andarAtual != totalAndares){
      andarAtual = andarSubir;
    }
  }

  //método desce
  public void desce(int andarDescer){
    this.andarDescer = andarDescer;
    if(andarDescer < andarAtual & andarAtual != 0){
      andarAtual = andarDescer;
    }
  }
}