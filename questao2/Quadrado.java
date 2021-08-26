public class Quadrado{
  private double lado;
  private double area;
  private double perimetro;

  //construtor
  public Quadrado(double lado){
    this.lado = lado;
  }

  //método calcular area
  public double calcularArea(){
    area = (lado*lado);
    return area;
  }  

  //método calcular perímetro
  public double calcularPerimetro(){
    perimetro = (4*lado);
    return perimetro;
  }

  //método imprimir
  public String imprimir(){
    return "Lado do quadrado: " + lado + "\n" + "Area: " + area +"\n"+ "Perimetro: " + perimetro;
  }

}