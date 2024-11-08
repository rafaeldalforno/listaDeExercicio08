package encapsulamento;

public class ProdutoValidacao extends ProdutoSimples{
  public ProdutoValidacao(String nome, double preco, int quantidade) {
    super(nome, preco, quantidade);
  }
  public double aplicarDesconto(double porcentagem){
    if(porcentagem >50 || porcentagem < 0){
      throw new RuntimeException("A porcentagem não pode ser maior que 50% ou menor que 0%");
    }
    return (getPreco() * (porcentagem / 100));
  }
}