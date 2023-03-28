package br.com.alura.desenvolvedorjava.testes;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) throws IOException {
		//M�todo Scanner, com o FileInputStream de cria��o de arquivo como par�metro
		Scanner entrada = new Scanner(System.in);
		
		//M�todo PrintStream, com o FileOutputStream de cria��o de arquivo de sa�da como par�metro
		PrintStream saida = new PrintStream(new FileOutputStream("saida.txt"));

		System.out.println("Digite uma mensagem: ");
		//La�o de leitura do arquivo de entrada, que ser� a base pra escrita do sa�da.txt
		while (entrada.hasNextLine()) {
			//M�todo para escrita de cada linha no arquivo sa�da.txt
			saida.println(entrada.nextLine());
		}
		saida.close();
		entrada.close();
	}
}