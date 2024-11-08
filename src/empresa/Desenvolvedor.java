package empresa;

public class Desenvolvedor extends Funcionario {

  public Desenvolvedor(String name, double salario) {
    super(name, salario, 10);
  }

  @Override
  public Funcionario promover(double salario) {
    return new Gerente(this.getName(), salario);
  }
}
