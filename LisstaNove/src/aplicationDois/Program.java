package aplicationDois;

import java.util.Scanner;
import model.entites2.Account;
import model.exception2.BusinessException;


public class Program {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print("Number: ");
			int numero = sc.nextInt();
			System.out.print("Holder: ");
			String nome = sc.next();
			System.out.print("Initial balance: ");
			double saldo = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limiteSaque = sc.nextDouble();
			
			Account conta = new Account(numero, nome, saldo, limiteSaque);
			
			System.out.print("Enter amount for withdraw: ");
			double saque = sc.nextDouble();
			conta.withdraw(saque);
			System.out.print("New balance: " + String.format("$ %.2f", conta.getBalance()));
		} catch (BusinessException e) {
			System.out.print("Error in Resevation: " + e.getMessage());
		}
		
		sc.close();
	}
}
