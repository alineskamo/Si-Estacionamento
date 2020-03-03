package aula1302;

public class Professor {
	String nome;
	String titulacao;
	double valorHoraAula;
	int totalDeAulas;
	
	public double calcularSalario() {
		double SB, HA, DSR;
		SB = totalDeAulas*4.5*valorHoraAula;		
		if(titulacao.equalsIgnoreCase("mestre")){
			SB *= 1.3;
		} else {
			SB *= 1.85;
		}
		
		HA = SB * 0.05;
		
		DSR = (SB + HA)/6;
		
		return SB + HA + DSR;		
	}
	
	public void ajustarValorAulaHora(double porcentagem) {
		valorHoraAula= (valorHoraAula * (porcentagem/100));		
	}
	
}


