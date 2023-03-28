package tcp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {
	
	public static void main(String[] args) {
		
		try {
			// Instancia o ServerSocket ouvindo a porta 12345
			ServerSocket servidor = new ServerSocket(12345);
			System.out.println("Servidor ouvindo a porta TCP 12345");
			
			while (true) {
				
				// o método accept() bloqueia a execução até que
				// o servidor receba um pedido de conexão
				Socket cliente = servidor.accept();
				System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
				
				ObjectInputStream input = new ObjectInputStream(cliente.getInputStream());
				String siteip = (String) input.readObject();
				
				InetAddress site = InetAddress.getByName(siteip);
				String hostIP = site.getHostAddress();
				String hostName = site.getHostName();
				System.out.println( "IP: " + hostIP + "\n" + "Name: " + hostName);
				
				ObjectOutputStream output = new ObjectOutputStream(cliente.getOutputStream());
				output.flush();
				output.writeObject(site);
				input.close();
				output.close();
				cliente.close();
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
		}
	}
}
