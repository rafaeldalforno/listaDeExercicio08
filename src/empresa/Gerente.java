package empresa;

public class Gerente extends Funcionario{
  public Gerente(String name, double salario) {
    super(name, salario, 20);
  }

  @Override
  public Funcionario promover(double salario) {
    this.setSalario(salario);
    return null;
  }
}
