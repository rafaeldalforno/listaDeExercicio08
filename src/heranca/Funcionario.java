package heranca;

public class Funcionario {
  protected String nome;
  protected double salario;
  public Funcionario(String nome, double salario){
    this.nome = nome;
    if(salario < 0) throw new RuntimeException("O salario não pode ser negativo!");
    this.salario = salario;
  }
  public void trabalhar(){
    System.out.println(nome + " está trabalhando!");
  }
}
