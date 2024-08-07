package dados;

public enum Categoria {

	ACT("Acao"),
	STR("Estrategia"),
	SIM("Simulacao");

	private String nome;

	private Categoria(String nome) {this.nome = nome;}

	public static Categoria valor(String x) {
		switch (x) {
			case "Estrategia" -> {return STR;}
			case "Acao" -> {return ACT;}
			case "Simulacao" -> {return SIM;}
			default -> {return null;}
		}
	}
	
	public String getNome() {return nome;}
}
