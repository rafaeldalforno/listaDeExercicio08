package polimorfismo;

public class Cachorro extends Animal{
  @Override
  void emitirSom() {
    System.out.println("Cachorro faz: Au Au!");
  }
}