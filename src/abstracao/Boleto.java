package abstracao;

public class Boleto extends FormaPagamento{
  private double valorBoleto;
  private double valorPago;
  private double multa;
  private int diasExpBoleto;

  public Boleto(double valorBoleto, double multa) {
    this.valorBoleto = valorBoleto;
    this.multa = multa;
    this.valorPago = 0;
    this.diasExpBoleto = 2;
  }
  public void passarDia(){
    this.diasExpBoleto--;
  }
  @Override
  boolean processarPagamento(double valor) {
    if(valor <= 0){
      System.out.println("O valor pago não pode ser negativo nem nulo!");
      return false;
    }
    valorPago = valor;
    return true;
  }

  @Override
  boolean validarPagamento() {
    if(diasExpBoleto == 0){
      System.out.println("Boleto expirou, porfavor gerar outro com multa!");
      return false;
    }
    if(valorPago > valorBoleto + multa){
      System.out.println("Foi pago " + (valorPago - valorBoleto - multa) +" a mais");
      return true;
    }
    if(valorPago == valorBoleto + multa){
      return true;
    }
    if(valorPago > 0 && valorPago < valorBoleto + multa){
      System.out.println("Não foi pago todo o valor do boleto" +
          "falta: " + (valorBoleto + multa - valorPago));
      return false;
    }
    System.out.println("Boleto não foi pago");
    return false;
  }
}