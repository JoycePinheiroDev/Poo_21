class Main {
  public static void main(String[] args) {
    Televisor t1 = new Televisor(12, 13, true);
    ControleRemoto c1 = new ControleRemoto(t1);
    c1.desligar();
    System.out.println(t1);

    c1.ligar();
    System.out.println(t1);
    
    c1.aumentarVolume();
    c1.trocarCanal(16);
    System.out.println(t1);


  }
}