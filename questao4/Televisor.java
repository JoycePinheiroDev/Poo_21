public class Televisor{
  public int canal; // para ter acesso no controle
  private int volume;
  private boolean ligado;


  public Televisor(int canal, int volume, boolean ligado){
    this.canal = canal;
    this.volume = volume;
    this.ligado = ligado;
  }

  //ligar
  public String ligar(){
    ligado = true;
    return "Ligou o televisor";
  }

  //desligar
  public String desligar(){
    ligado = false;
    return "Desligou o televisor";
  }

  //aumentar volume
  public String aumentarVolume(){
    volume += 1;
    return "Volume: " + volume;
  }

  //diminuir volume
  public String diminuirVolume(){
    volume -= 1;
    return "Volume: " + volume;
  }

  // trocar canal
  public void trocarCanal(int canal){
    this.canal = canal;
  }

  //toString
  public String toString(){
    return "Ligado: " + ligado + "\n" +
    "Canal: " + canal + "\n" +
    "Volume: " + volume;
  }
}