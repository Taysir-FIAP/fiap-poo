package br.com.fiapride.main;

//Importamos a classe Passageiro para que o sistema a reconheça

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Carro;

public class SistemaPrincipal {

 public static void main(String[] args) {
     // INSTANCIAÇÃO
     // O comando 'new' aloca memória para um novo objeto.
     // Criando o primeiro passageiro (Objeto 1)
     /*Passageiro passageiro1 = new Passageiro("Ana Silva", "222.222");
	 System.out.println("Recarga passageiro 1");
     passageiro1.adicionarSaldo(50.0);

     // Criando o segundo passageiro (Objeto 2)
     Passageiro passageiro2 = new Passageiro("Taysir Ali", "666.666");
     System.out.println("\nRecarga passageiro 2");
     passageiro2.adicionarSaldo(1000.0);
     
     //Criando o segundo passageiro (Objeto 3)
     Passageiro passageiro3 = new Passageiro("Vitor Limeira", "777.777");
     System.out.println("\nRecarga passageiro 3");
     passageiro3.adicionarSaldo(12.5);
     

     // Exibindo os dados no Console
     System.out.println("\n--- Sistema FiapRide ---");
     System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$ " + passageiro1.saldo + " | CPF: " + passageiro1.cpf);
     System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$ " + passageiro2.saldo + " | CPF: " + passageiro2.cpf);
     System.out.println("Passageiro: " + passageiro3.nome + " | Saldo: R$ " + passageiro3.saldo + " | CPF: " + passageiro3.cpf);
     
     //Método de pagar viagem
     System.out.println("\nPagando viagem do passageiro 1");
     passageiro1.pagarViagem(20);
     System.out.println("\nPagando viagem do passageiro 2");
     passageiro2.pagarViagem(500);
     System.out.println("\nPagando viagem do passageiro 3");
     passageiro3.pagarViagem(20);
     */
     
     
     // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
	 
	 //Micro Desafio
	 
	 // Criando o primeiro Carro (Objeto 1)
     Carro carro1 = new Carro("BYD", "Elétrico", 1000.00, 15);
	 
     Carro carro2 = new Carro("Volkswagen", "Combustão", 1500.00, 50);
     
     Carro carro3 = new Carro("BMW", "Híbrido", 2500.00, 80);
     
     // Exibindo os dados no Console
     System.out.println("--- Sistema FiapRide ---");
     System.out.println("Carro: " + carro1.marca + " | Tipo do Motor: " + carro1.tipoMotorizacao + " | Preço: R$" + carro1.preco);
     System.out.println("Carro: " + carro2.marca + " | Tipo do Motor: " + carro2.tipoMotorizacao + " | Preço: R$" + carro2.preco);
     System.out.println("Carro: " + carro3.marca + " | Tipo do Motor: " + carro3.tipoMotorizacao + " | Preço: R$" + carro3.preco);

     // Chamando os métodos
     System.out.println("\n--- Teste de ações dos carros ---");

     carro1.dirigir(5);
     carro1.precisaAbastecer(carro1.tipoMotorizacao);

     carro2.dirigir(20);
     carro2.precisaAbastecer(carro2.tipoMotorizacao);

     carro3.dirigir(10);
     carro3.precisaAbastecer(carro3.tipoMotorizacao);
 }
}