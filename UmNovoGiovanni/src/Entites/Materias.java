package Entites;

public class Materias {
	private String nomeMateria;
	private Double nota1;
	private Double nota2;
	
	public Materias(String nomeMateria, Double nota1, Double nota2) {
		this.nomeMateria = nomeMateria;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}
	
	public double media() {
		return (nota1 + nota2)/2;
	}
	
	public String toString() {
		String sit;
		if (media() >= 7) {
			sit = "Aprovado";
		}
		else if (media() >= 5 && media() < 7) {
			sit = "Recuperação";
		}
		else {
			sit = "Reprovado";
		}
		return "Materia: " + nomeMateria 
				+ " | 1° Avaliação: " + String.format("%.1f", nota1) 
				+ " | 2° Avaliação:" + String.format("%.1f", nota2)
				+ "| Media: " + String.format("%.1f", media())
				+ "| Situação: " + sit;
	}
}
