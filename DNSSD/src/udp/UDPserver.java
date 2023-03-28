package udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPserver {
	public static void main(String args[]) throws Exception {
		
		try {
			
			int clientport = 789, serverport = 790;
			DatagramSocket ds = new DatagramSocket(clientport);
			byte buffer[] = new byte[1024];
	
			System.out.println("Servidor ouvindo a porta UDP" + serverport);

			while (true) {
				
				BufferedReader dis = new BufferedReader(new InputStreamReader(System.in));
				InetAddress ia = InetAddress.getLocalHost();
				
				DatagramPacket p = new DatagramPacket(buffer, buffer.length);
				ds.receive(p);
				String psx = new String(p.getData(), 0, p.getLength());
				System.out.println("Client:" + psx);
	
				InetAddress ib = InetAddress.getByName(psx);
				String hostIP = ib.getHostAddress();
				String hostName = ib.getHostName();
				System.out.println( "IP: " + hostIP + "\n" + "Name: " + hostName);
				String str = hostIP + hostName;
	
				buffer = str.getBytes();
				ds.send(new DatagramPacket(buffer, str.length(), ia, serverport));
			}
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
		}
	}
}
