package dados;

import static java.lang.StringTemplate.STR;

import java.text.NumberFormat;
import java.util.Locale;

@SuppressWarnings("unused")
public class JogoTabuleiro extends Jogo {

	private String nome;
	private int ano, numeroPecas;
	private double precoBase;
	
	public JogoTabuleiro(String nome, int ano, double precoBase, int numeroPecas) {
		super(nome, ano, precoBase);
		this.nome = nome;
		this.ano = ano;
		this.precoBase = precoBase;
		this.numeroPecas = numeroPecas;
	}

	@Override
	public double calculaPrecoFinal() {return ((0.01*precoBase) * numeroPecas) + precoBase;}
	public int getNumeroPecas() {return numeroPecas;}

	@Override
	public String getDescricao() {
		return STR."\{nome}, \{ano}, \{NumberFormat.getCurrencyInstance(Locale.of("pt", "BR")).format(precoBase)}, \{numeroPecas}, \{NumberFormat.getCurrencyInstance(Locale.of("pt", "BR")).format(calculaPrecoFinal())}";
	}
}
