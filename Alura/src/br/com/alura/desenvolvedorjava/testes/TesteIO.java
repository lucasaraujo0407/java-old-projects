package br.com.alura.desenvolvedorjava.testes;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteIO {

	public static void main(String[] args) throws IOException {				
				
		BufferedReader bf = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));
		
		//System.out.println("Digite sua mensagem: ");
		String linha = bf.readLine();
		
		while(linha != null){
			System.out.println(linha);
			linha = bf.readLine();
		}
		
		bf.close();
	}
}
