package br.com.fiapride.main;

//Importamos a classe Passageiro para que o sistema a reconheça

//import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

 public static void main(String[] args) {
     // INSTANCIAÇÃO
     // O comando 'new' aloca memória para um novo objeto.
     // Criando o primeiro passageiro (Objeto 1)
     //Passageiro passageiro1 = new Passageiro();
     //passageiro1.nome = "Ana Silva";
     //passageiro1.saldo = 50.0;

     // Criando o segundo passageiro (Objeto 2)
     //Passageiro passageiro2 = new Passageiro();
     //passageiro2.nome = "Carlos Souza";
     //passageiro2.saldo = 12.50;

     // Exibindo os dados no Console
     //System.out.println("--- Sistema FiapRide ---");
     //System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
     //System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
     
     // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
	 
	 //Micro Desafio
	 
	 // Criando o primeiro Carro (Objeto 1)
     Carro carro1 = new Carro();
     carro1.marca = "BYD";
     carro1.tipoMotorizacao = "Elétrico";
     carro1.preco = 1000.00;
	 
     Carro carro2 = new Carro();
     carro2.marca = "Volkswagen";
     carro2.tipoMotorizacao = "Combustivel";
     carro2.preco = 1500.00;
     
     Carro carro3 = new Carro();
     carro3.marca = "BMW";
     carro3.tipoMotorizacao = "Híbrido";
     carro3.preco = 2500.00;
     
     // Exibindo os dados no Console
     System.out.println("--- Sistema FiapRide ---");
     System.out.println("Carro: " + carro1.marca + " | Tipo do Motor: " + carro1.tipoMotorizacao + " | Preço: R$" + carro1.preco);
     System.out.println("Carro: " + carro2.marca + " | Tipo do Motor: " + carro2.tipoMotorizacao + " | Preço: R$" + carro2.preco);
     System.out.println("Carro: " + carro3.marca + " | Tipo do Motor: " + carro3.tipoMotorizacao + " | Preço: R$" + carro3.preco);
 }
}