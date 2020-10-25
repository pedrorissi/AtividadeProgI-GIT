package principal;
import classes.Diretor;
import classes.Filme;


public class TesteFilme {
	public static void main(String[] args) {
		Filme f1 = new Filme("Batman", "Homem morcego achando que é justiceiro", 200, "Nolan", 10, "Chicago");
		Diretor d1 = f1.getDiretor();
		
		Filme f2 = new Filme("Inception", "Pessoal que invade sonho alheio", 153, d1.getNome(),d1.getTempoDeExperiencia(), d1.getLocalDeOrigem());
		
		
		
		//Diretor d1 = new Diretor("Nolan", 10, "Chicago");
		//f1.setDiretor(d1);
		
		
		//System.out.println(d1.getLocalDeOrigem());
		
		//System.out.println(f1.getDiretor().getTempoDeExperiencia());
		
		System.out.println(f1);
		System.out.println(f2);
		
		f2.exibirDuracaoEmHoras(f2.getDuracaoEmMinutos());
		//f1.exibirDuracaoEmHoras(f1.getDuracaoEmMinutos());
	}

	
}
