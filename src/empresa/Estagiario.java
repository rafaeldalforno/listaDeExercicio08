package empresa;

public class Estagiario extends Funcionario{
  public Estagiario(String name, double salario) {
    super(name, salario, 0);
  }

  @Override
  public Funcionario promover(double salario) {
    return new Desenvolvedor(this.getName(), salario);
  }
}
