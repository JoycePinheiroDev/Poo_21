public class ControleRemoto{
  private Televisor televisor;

  public ControleRemoto(Televisor televisor){
    this.televisor = televisor;
  }

  public String ligar(){
    this.televisor.ligar();
    return "Ligou o televisor";
  }

  //desligar
  public String desligar(){
    this.televisor.desligar();
    return "Desligou o televisor";
  }

  //aumentar volume
  public String aumentarVolume(){
    this.televisor.aumentarVolume();
    return "Volume foi aumentado";
  }

  //diminuir volume
  public String diminuirVolume(){
    this.televisor.diminuirVolume();
    return "Volume foi diminuido";
  }

  // trocar canal
  public void trocarCanal(int canal){
    this.televisor.canal = canal;
  }
}