public class Porta{
  private String nome;
  private double altura;
  private double largura;
  private boolean estaAberta;
  
  // construtor
  public Porta(String nome, double altura, double largura, boolean estaAberta){
    this.nome = nome;
    this.altura = altura;
    this.largura = largura;
    this.estaAberta = estaAberta;
  }

  //gets e sets 
  public String getNome(){
    return nome;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public double getAltura(){
    return altura;
  }
  public void setAltura(double altura){
    this.altura = altura;
  }

  public double getLargura(){
    return largura;
  }
  public void setLargura(double largura){
    this.largura = largura;
  }

  public boolean getEstaAberta(){
    return estaAberta;
  }
  public void setEstaAberta(boolean estaAberta){
    this.estaAberta = estaAberta;
  }

  //toString
  public String toString(){
    return "Nome: " + nome + "\n" + 
    "Altura: " + altura + "\n" + 
    "Largura: " + largura + "\n" + 
    "Esta aberta: "+ estaAberta;
  }
}