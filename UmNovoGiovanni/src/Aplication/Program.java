package Aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Entites.Boletim;

public class Program {
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\eross\\OneDrive\\Área de Trabalho\\out\\Boletins.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			System.out.print("Matricula: ");
			int matricula = sc.nextInt();
			System.out.print("Nome: ");
			String nome = sc.next();
			Boletim boletim = new Boletim(matricula, nome);
			
			System.out.print("Quantidade de materias: ");
			int n = sc.nextInt();
			for(int i = 0;i < n ;i++) {
				System.out.print("Materia: ");
				String materia = sc.next();
				System.out.print("1° Avaliação: ");
				double nota1 = sc.nextDouble();
				System.out.print("2° Avaliação: ");
				double nota2 = sc.nextDouble();
				boletim.adiMateria(materia, nota1, nota2);
			}
			bw.write(boletim.imprimirAluno());
		}
		catch (IOException e) {
				System.out.print("Error: " + e.getMessage());
			}
		
		sc.close();
	}
}
