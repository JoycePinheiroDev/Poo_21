class Main {
  public static void main(String[] args) {
    Conta c = new Conta("João", 2000, 5000);
    System.out.println(c.getValorSaldo());
    c.deposito(1000);
    System.out.println(c.getValorSaldo());
    c.saque(-500.0);
    System.out.println(c.getValorSaldo());
    System.out.println(c);


  }
}