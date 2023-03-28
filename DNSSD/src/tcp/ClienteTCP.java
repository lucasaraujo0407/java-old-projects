package tcp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClienteTCP {
	public static void main(String[] args) {
		try {
			String site;
			site = JOptionPane.showInputDialog("Digite site:");
			
			long tempoInicio = System.currentTimeMillis();
			
			Socket server = new Socket("localhost", 12345);
		
			ObjectOutputStream output = new ObjectOutputStream(server.getOutputStream());
			output.flush();
			output.writeObject(site);

			while (true) {
				
				ObjectInputStream input = new ObjectInputStream(server.getInputStream());
				InetAddress siteip = (InetAddress) input.readObject();
				
				JOptionPane.showMessageDialog(null, "Tempo Total de Execução: "+(System.currentTimeMillis()-tempoInicio));

				JOptionPane.showMessageDialog(null, "Dados recebido do servidor:" + siteip);
				input.close();
				System.out.println("Conexão encerrada");
				output.close();
				server.close();
			}	
		}
		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} 
	}
}
