package polimorfismo;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<IMeioTransporte> array = new ArrayList<>();
    array.add(new Carro());
    array.add(new Bicicleta());
    array.add(new Trem());
    for(IMeioTransporte meio : array){
      meio.acelerar();
      meio.frear();
    }
    ArrayList<Animal> animais = new ArrayList<>();
    animais.add(new Cachorro());
    animais.add(new Gato());
    animais.add(new Vaca());
    for(Animal animal : animais){
      animal.emitirSom();
    }
  }
}