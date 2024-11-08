package abstracao;

public abstract class FormaPagamento {
  abstract boolean processarPagamento(double valor);
  abstract boolean validarPagamento();
}
