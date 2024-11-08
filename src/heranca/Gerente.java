package heranca;

public class Gerente extends Funcionario{
  public Gerente(String nome, double salario){
    super(nome, salario);
  }
  public double calcularBonus(){
    return (this.salario * ((double) 20 / 100));
  }
  @Override
  public void trabalhar(){
    System.out.println(nome + " está mandando!");
  }
}
