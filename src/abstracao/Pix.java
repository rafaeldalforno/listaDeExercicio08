package abstracao;

public class Pix extends FormaPagamento{
  private double valorPagar;
  private double valorRecebido;
  private boolean status;
  public Pix(double valorPagar){
    this.valorPagar = valorPagar;
    this.valorRecebido = 0;
    this.status = false;
  }
  @Override
  boolean processarPagamento(double valor) {
    if(this.status){
      System.out.println("Pix ja realizado!");
      return true;
    }
    this.valorRecebido = valor;
    if(validarPagamento()){
      System.out.println("Pagamento realizado com sucesso!");
      return true;
    }
    this.valorRecebido = 0;
    return false;
  }
  @Override
  boolean validarPagamento() {
    if(this.valorRecebido <= 0){
      System.out.println("Valor recebido não pode ser negativo ou nulo");
      return false;
    }
    if(this.valorRecebido < this.valorPagar){
      System.out.println("Valor pago insuficiente");
      return false;
    }
    if(this.valorRecebido > this.valorPagar){
      System.out.println("Valor pago excedente");
      return false;
    }
    this.status = true;
    return true;
  }
}
