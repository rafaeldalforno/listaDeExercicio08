package empresa;

public abstract class Funcionario {
  private String name;
  private double salario;
  private double bonus;

  public Funcionario(String name, double salario, double bonus) {
    this.name = name;
    this.salario = salario;
    this.bonus = bonus;
  }

  abstract public Funcionario promover(double salario);

  public double calcularSalario(){
    return this.salario + (this.salario * (bonus / 100));
  }

  public double getBonus() {
    return bonus;
  }

  public double getSalario() {
    return salario;
  }

  public String getName() {
    return name;
  }

  public void setSalario(double salario) {
    if(salario < this.salario){
      throw new RuntimeException("Salario não pode regredir");
    }
    if(salario <= 0){
      throw new RuntimeException("Salario não pode ser negativo");
    }
    System.out.println("Salario atualizado!");
    this.salario = salario;
  }
  public void setBonus(double bonus) {
    if(bonus < 0){
      throw new RuntimeException("Bonus não pode ser negativo!");
    }
    this.bonus = bonus;
  }
}
