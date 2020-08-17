package principal;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import conta.Conta;
import produtos.Produto;

public class Principal {

	public static void main(String[] args) {
		/*
		Produto tv = new Produto("TV", 900.00, 10);
		
		Produto notebook = new Produto("Notebook", 1600.00, 20);
		
		Produto lapis = new Produto("Lapis", 1.00, 9);
		
		
		System.out.println(tv.getQuantidade());
		tv.addProdutos(5);
		System.out.println(tv.getQuantidade());
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
        double depositoInicial;
		
		System.out.println("Digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Digite o nome do correntista: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		Conta cb = new Conta(numeroConta, nome);
		
		System.out.println("Gostaria de fazer um deposito inicial? (S/N) ");
		char opt = sc.nextLine().toLowerCase().charAt(0);
		
		if (opt == 's') {
			System.out.println("Digite o valor do deposito inicial: ");
			depositoInicial = sc.nextDouble();
			cb.deposito(depositoInicial);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(cb);
		
		System.out.println();
		System.out.println("Digite o valor do deposito: ");
		double deposito = sc.nextDouble();
		cb.deposito(deposito);
		System.out.println("Dados atualizados: ");
		System.out.println(cb);
		
		System.out.println();
		System.out.println("Digite o valor do saque: ");
		double saque = sc.nextDouble();
		cb.saque(saque);
		System.out.println("Dados atualizados: ");       
		System.out.println(cb);
		sc.close();
		*/
		
		// A lista tem tamanho dinâmico
		List<Produto> lista = new ArrayList();
		
		//O vetor tem tamanho inicial definido:
		//Integer[] numeros = new Integer[5];
		
		Produto prod = new Produto("TV", 900.00, 10);
		lista.add(prod);
		
		lista.add(new Produto("Microondas", 300.00, 100));
		
		double soma = 0.0;
		//for(int i=0; i < lista.size(); i++) {
		//	soma = soma + lista.get(i).getPreco();	
		//}
		//System.out.println("Soma: " + soma);
		for(Produto p : lista) {// Específico pra percorrer listas
			soma = soma + p.getPreco();	
		}
		System.out.println("Soma: " + soma);
	}

}
