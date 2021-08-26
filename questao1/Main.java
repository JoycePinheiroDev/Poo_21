class Main {
  public static void main(String[] args) {
    Porta p1 = new Porta("porta1", 2.6, 1.6, true);
    System.out.println(p1);
    p1.getNome();
    p1.setNome("porta de carvalho");
    System.out.println(p1);

  }
}