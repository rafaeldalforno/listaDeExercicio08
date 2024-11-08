package heranca;

public class Desenvolvedor extends Funcionario{
  public Desenvolvedor(String nome, double salario){
    super(nome, salario);
  }
  public double calcularBonus(){
    return this.salario * ((double) 10 / 100);
  }
  @Override
  public void trabalhar(){
    System.out.println(nome + " está desenvolvendo!");
  }
}
