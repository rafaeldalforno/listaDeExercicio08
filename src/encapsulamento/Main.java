package encapsulamento;

public class Main {
  public static void main(String[] args) {
    ProdutoValidacao lapis = new ProdutoValidacao("Lapis", 2, 22);
    System.out.println(lapis.aplicarDesconto(50));
  }
}
