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

	    if (this.textoTipoMotorizazao == "elétrico") {
	        this.nivelBateria = this.tanquePorcentagem;

	        if (this.nivelBateria <= 20)
	            System.out.println("É necessário carregar o veículo em " + (100 - this.nivelBateria) + "%!");
	        return;
	    }

	    if (this.textoTipoMotorizazao == "combustão") {
	        this.nivelCombustivel = this.tanquePorcentagem;

	        if (this.nivelCombustivel <= 20)
	            System.out.println("É necessário reabastecer o veículo!");
	        return;
	    }
	}
 	
	public void dirigir(int consumo) {

	    if (this.textoTipoMotorizazao.equals("elétrico")) {
	        this.nivelBateria = this.tanquePorcentagem - consumo;

	        if (this.nivelBateria < 0) {
	            this.nivelBateria = 0;
	        }

	        System.out.println("O carro " + this.marca + " (elétrico) dirigiu e agora a bateria está em " + this.nivelBateria + "%");
	        this.tanquePorcentagem = this.nivelBateria;
	        return;
	    }

	    if (this.textoTipoMotorizazao.equals("combustão")) {
	        this.nivelCombustivel = this.tanquePorcentagem - consumo;

	        if (this.nivelCombustivel < 0) {
	            this.nivelCombustivel = 0;
	        }

	        System.out.println("O carro " + this.marca + " (combustão) dirigiu e agora o combustível está em " + this.nivelCombustivel + "%");
	        this.tanquePorcentagem = this.nivelCombustivel;
	        return;
	    }

	    if (this.textoTipoMotorizazao.equals("híbrido")) {
	        int nivel = this.tanquePorcentagem - consumo;

	        if (nivel < 0) {
	            nivel = 0;
	        }

	        System.out.println("O carro " + this.marca + " (híbrido) dirigiu e agora a energia está em " + nivel + "%");
	        this.tanquePorcentagem = nivel;
	        return;
	    }
	}
}