package classes;


public class Filme {
	private String titulo;
	private String descricao;
	private int duracaoEmMinutos;
	private Diretor diretor;
	
	//INICIO CONSTRUTORES
	
	public Filme() {
		
	}
	
	public Filme(String titulo, String descricao, int duracaoEmMinutos, String nome, int tempoDeExperiencia, String localdeOrigem) {
		
		this.titulo = titulo;
		this.descricao = descricao;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.diretor = new Diretor(nome, tempoDeExperiencia, localdeOrigem);
	
	}
	//FIM CONSTRUTORES

	//INICIO GETTERS A SETTERS
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	//FIM GETTERS E SETTERS
	
	//MÉTODOS
	@Override
	public String toString() {
		return "Filme: " + titulo + "\n Descrição: " + descricao + "\n Duração: " + duracaoEmMinutos + "m" + "\n \n Diretor:  " + this.diretor.getNome() + "\n Tempo de Experiência: " + this.diretor.getTempoDeExperiencia() + "anos\n Local de Origem: " + this.diretor.getLocalDeOrigem() + "\n---\n";

	}
	
	public void exibirDuracaoEmHoras(int tempoEmHora) {
		int min, hora;
		tempoEmHora = this.getDuracaoEmMinutos();
		hora = tempoEmHora / 60;
		min = tempoEmHora % 60;
		 System.out.println("O filme " +  this.getTitulo() + " possui " + hora + " horas e " + min + " minutos de duração.");
		
		
		
	}
	
	
	
}
