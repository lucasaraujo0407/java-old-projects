import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class EntradaScanner {

	public static void main(String[] args) throws IOException {
		//Método Scanner, com o FileInputStream de criação de arquivo como parâmetro
		Scanner entrada = new Scanner(System.in);
		
		//Método PrintStream, com o FileOutputStream de criação de arquivo de saída como parâmetro
		PrintStream saida = new PrintStream(new FileOutputStream("saida.txt"));

		System.out.println("Digite uma mensagem: ");
		//Laço de leitura do arquivo de entrada, que será a base pra escrita do saída.txt
		while (entrada.hasNextLine()) {
			//Método para escrita de cada linha no arquivo saída.txt
			saida.println(entrada.nextLine());
		}
		saida.close();
		entrada.close();
	}
}