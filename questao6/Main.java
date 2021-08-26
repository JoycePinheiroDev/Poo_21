class Main {
  public static void main(String[] args) {
    Elevador e1 = new Elevador(10, 9);
    System.out.println(e1);
    e1.entrar();
    e1.entrar();
    System.out.println(e1);
    e1.sobe(3);
    e1.sair();
    System.out.println(e1);
    e1.desce(2);
    System.out.println(e1);
   
  }
}