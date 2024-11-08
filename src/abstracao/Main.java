package abstracao;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);
    System.out.println("Sua conta deu R$ 30.00 como deseja pagar?");
    System.out.println("1-Pix, 2-Cartão de Credito, 3- Boleto.");
    int escolha = myScan.nextInt();
    myScan.nextLine();
    switch (escolha){
      case 1:
        Pix pix = new Pix(30);
        pix.processarPagamento(30);
        break;
      case 2:
        CartaoCredito cartao = new CartaoCredito(30);
        cartao.processarPagamento(30);
        System.out.println(cartao.validarPagamento());
        break;
      case 3:
        Boleto boleto = new Boleto(30, 0);
        boleto.processarPagamento(30);
        if(boleto.validarPagamento()) System.out.println("Pagamento realizado com sucesso");
        break;
      default:
        System.out.println("Escolha não valida!");
    }
  }
}