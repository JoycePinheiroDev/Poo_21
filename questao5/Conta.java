public class Conta{
  private String nomeCliente;
  private double valorSaldo;
  private double limite;
  private double valorDeposito;
  private double valorSaque;

  //construtor
  public Conta(String nomeCliente, double valorSaldo, double limite){
    this.nomeCliente = nomeCliente;
    this.valorSaldo = valorSaldo;
    this.limite = limite;
  }

  //gets e sets
  public String getNomeCliente(){
    return nomeCliente;
  }
  public void setNomeCliente(String nomeCliente){
    this.nomeCliente = nomeCliente;
  }

  public double getValorSaldo(){
    return valorSaldo;
  }
  public void setValorSaldo(double valorSaldo){
    this.valorSaldo = valorSaldo;
  }

  public double getLimite(){
    return limite;
  }
  public void setLimite(double limite){
    this.limite = limite;
  }

  //toString
  public String toString(){
    return "Nome do cliente: " + nomeCliente + "\n" +
    "Valor do saldo: " + valorSaldo + "\n" +
    "Valor do limite: " + limite;
  }

  //método deposito
  public void deposito(double valorDeposito){
    this.valorDeposito = valorDeposito;
    if(valorDeposito>0.0 & (valorSaldo+valorDeposito)<= limite){
      valorSaldo += valorDeposito;
    }
  }

  //método saque
  public void saque(double valorSaque){
    this.valorSaque = valorSaque;
    if(valorSaque<0.0 & (valorSaldo>=valorSaque)){
      valorSaldo += valorSaque;
    }
  }

}