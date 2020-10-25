package principal;
import classes.Diretor;
import classes.Filme;


public class TesteFilme {
	public static void main(String[] args) {
		Filme f1 = new Filme("Batman", "Homem morcego achando que é justiceiro", 200, "Nolan", 20, "Chicago");
		Diretor d1 = f1.getDiretor();
		System.out.println(f1);
		f1.exibirDuracaoEmHoras(f1.getDuracaoEmMinutos());
		
		
		Filme f2 = new Filme("Inception", "Pessoal que invade sonho alheio", 153, d1.getNome(),d1.getTempoDeExperiencia(), d1.getLocalDeOrigem());
		System.out.println(f2);
		f2.exibirDuracaoEmHoras(f2.getDuracaoEmMinutos());
	
		
		Diretor d2 = new Diretor("Spike Lee", 15, "Nova York");
	
		Filme f3 = new Filme("BlacKkKlansman", "Policiais que se infiltram na KKK", 136, d2.getNome(),d2.getTempoDeExperiencia(),d2.getLocalDeOrigem());
		System.out.println(f3);
		f3.exibirDuracaoEmHoras(f3.getDuracaoEmMinutos());
		
		
	}

	
}
