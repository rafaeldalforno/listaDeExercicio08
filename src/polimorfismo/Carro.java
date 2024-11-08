package polimorfismo;

public class Carro implements IMeioTransporte{
  @Override
  public void acelerar() {
    System.out.println("O Carro está acelerando!");
  }

  @Override
  public void frear() {
    System.out.println("O Carro está freando!");
  }
}
