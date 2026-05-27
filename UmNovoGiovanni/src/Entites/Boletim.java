package Entites;

import java.util.ArrayList;
import java.util.List;

public class Boletim {
	private Integer matricula;
	private String nomeAluno;
	private List<Materias> materias;

	public Boletim(Integer matricula, String nomeAluno) {
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.materias = new ArrayList<>();
	}

	public void adiMateria(String nomeMateria, Double nota1, Double nota2) {
		materias.add(new Materias(nomeMateria, nota1, nota2));
	}

	public String imprimirAluno() {
		StringBuilder sb = new StringBuilder();
	    
	    sb.append("==================================\n");
	    sb.append("Matricula: ").append(matricula).append("\n");
	    sb.append("Nome: ").append(nomeAluno).append("\n");
	    
	    for (Materias materia : materias) {
	        sb.append(materia).append("\n"); 
	    }
	    
	    return sb.toString();
	}

}
