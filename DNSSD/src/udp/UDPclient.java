package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JOptionPane;

public class UDPclient {
	public static void main(String args[]) throws Exception {
		try {
			String site;
			site = JOptionPane.showInputDialog("Digite site:");
			
			long tempoInicio = System.currentTimeMillis();
	
			int clientport = 789, serverport = 790;
			byte buffer[] = new byte[1024];
			
			DatagramSocket ds = new DatagramSocket(serverport);
			System.out.println("server waiting");
			InetAddress ia = InetAddress.getLocalHost();
			
			buffer = site.getBytes();
			ds.send(new DatagramPacket(buffer, site.length(), ia, clientport));

			while (true) {
				DatagramPacket p = new DatagramPacket(buffer, buffer.length);
				ds.receive(p);
				JOptionPane.showMessageDialog(null, "Tempo Total de Execução: "+(System.currentTimeMillis()-tempoInicio));
				
				String psx = new String(p.getData(), 0, p.getLength());
				System.out.println("Server:" + psx);
							
				JOptionPane.showMessageDialog(null, "Dados recebidos do Server:" + psx);
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} 
	}
}
