public class Retangulo{
  private double comprimento;
  private double largura;
  private double area;
  private double perimetro;

  //construtor
  public Retangulo(double comprimento, double largura){
    this.comprimento = comprimento;
    this.largura = largura;
  }

  //método calcular area
  public double calcularArea(){
    area = (comprimento*largura);
    return area;
  }

  //método calcular perimetro
  public double calcularPerimetro(){
    perimetro = (2 * comprimento) + (2 * largura);
    return perimetro;
  }

  //método imprimir
  public String imprimir(){
    return "Comprimento do retangulo: " + comprimento + "\n" 
    + "Largura do retangulo: " + largura + "\n" 
    + "Area do retangulo: " + area + "\n" 
    + "Perimetro do retangulo: " + perimetro;
  }
}