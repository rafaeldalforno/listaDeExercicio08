package encapsulamento;

public class ProdutoSimples {

  private String nome;
  private double preco;
  private int quantidade;
  public ProdutoSimples(String nome, double preco, int quantidade) {
    if(preco < 0) throw new RuntimeException("Preço não pode ser negativo!");
    if(quantidade < 0) throw new RuntimeException("Quantidade não pode ser negativo!");
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    if(preco < 0) throw new RuntimeException("Preço não pode ser negativo!");
    this.preco = preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    if(quantidade < 0) throw new RuntimeException("Quantidade não pode ser negativo!");
    this.quantidade = quantidade;
  }
}
