package classes;

public class Diretor {
	private String nome;
	private int tempoDeExperiencia;
	private String localDeOrigem;
	
	public Diretor() {
		
	}
	
	public Diretor(String nome, int tempoDeExperiencia, String localDeOrigem) 	{
		
		this.nome = nome;
		this.tempoDeExperiencia = tempoDeExperiencia;
		this.localDeOrigem = localDeOrigem;
	}
	
	//INICIO GETTERS E SETTERS

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoDeExperiencia() {
		return tempoDeExperiencia;
	}

	public void setTempoDeExperiencia(int tempoDeExperiencia) {
		this.tempoDeExperiencia = tempoDeExperiencia;
	}

	public String getLocalDeOrigem() {
		return localDeOrigem;
	}

	public void setLocalDeOrigem(String localDeOrigem) {
		this.localDeOrigem = localDeOrigem;
	}
	
	//FIM GETTERS E SETTERS
	
	public void imprimirToString() {

		System.out.println("Nome do diretor: " + this.getNome() + "/n Tempo de Experiência: " + this.getTempoDeExperiencia() + "/n Local de Origem: " + this.getLocalDeOrigem() + "/n--");
		
		
		
	}
	
	
	
	
	
	
}
