package br.com.fiapride.model;

//A Classe define a estrutura. Ela não é o passageiro real, é apenas o modelo.
public class Carro {
// Atributos (Características)
	public String marca;
	public String tipoMotorizacao;
	public String textoTipoMotorizazao;
	public int tanquePorcentagem;
	public int nivelBateria;
	public int nivelCombustivel;
	public double preco;
	
// Nota: Por enquanto usamos 'public' para facilitar o aprendizado.
// Nas próximas aulas, aprenderemos a proteger esses dados.
	
	public Carro(String marca, String tipoMotorizacao, double preco, int tanquePorcentagem) {
 		this.marca = marca;
 		this.tipoMotorizacao = tipoMotorizacao;// Novo Atributo
 		this.textoTipoMotorizazao = tipoMotorizacao.toLowerCase();
 		this.preco = preco;
 		this.tanquePorcentagem = tanquePorcentagem;
 		// "this." serve para se referir a variavel da classe
 	}
 	
 	public void precisaAbastecer(String textoTipoMotorizazao) {
        // Regra de negócio: O valor da recarga deve ser positivo
        if (this.textoTipoMotorizazao == "elétrico") {
        	this.nivelBateria = this.tanquePorcentagem;
        	if (this.nivelBateria <= 20)
            System.out.println("É necessário carregar o veículo em " + (100 - this.nivelBateria) + "%!");
            return; // Interrompe a execução do método
        }
        if (this.textoTipoMotorizazao == "combustão") {
        	this.nivelCombustivel = this.tanquePorcentagem;
        	if (this.nivelCombustivel <= 20)
        		System.out.println("É necessário reabastecer o veículo!");
            return; // Interrompe a execução do método
        }
        
    }
 	
 	/*public void fazerViagem() {
        // Regra de negócio: O custo deve ser positivo e o saldo deve ser suficiente
        if (custo <= 0) {
            System.out.println("Erro: O custo da viagem é inválido.");
            return;
        }
        if (this.saldo < custo) {
            System.out.println("Erro: Saldo insuficiente para realizar a viagem.");
            return;
        }
        this.saldo -= custo;
        System.out.println("Viagem paga. Saldo restante: " + this.saldo);
    }*/
}