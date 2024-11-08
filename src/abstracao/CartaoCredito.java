package abstracao;

public class CartaoCredito extends FormaPagamento{
  private double valorPagar;
  private boolean status;
  public CartaoCredito(double valorPagar){
    this.valorPagar = valorPagar;
    this.status = false;
  }
  @Override
  boolean processarPagamento(double valor) {
    if(this.status){
      System.out.println("Pagamento ja realizado!");
      return false;
    }
    if(valor == this.valorPagar){
      this.status = true;
      return true;
    }
    System.out.println("Valor insuficiente!");
    return false;
  }
  @Override
  boolean validarPagamento() {
    if (this.status){
      System.out.println("Pagamento feito com sucesso");
      return true;
    }
    System.out.println("Pagamento em aberto");
    return false;
  }
}
