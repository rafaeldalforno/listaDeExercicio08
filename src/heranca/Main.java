package heranca;

public class Main {
  public static void main(String[] args) {
    Desenvolvedor dev = new Desenvolvedor("Rafael", 3000);
    Gerente mestre = new Gerente("Jaques Hyago", 10000);
    System.out.println("Bonus do Jaques Hyago: " + mestre.calcularBonus());
    System.out.println("Bonus do Rafael: " + dev.calcularBonus());
    dev.trabalhar();
    mestre.trabalhar();
  }
}
