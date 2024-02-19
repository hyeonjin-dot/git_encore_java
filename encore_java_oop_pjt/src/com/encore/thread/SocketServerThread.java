package com.encore.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class SocketServerThread implements Runnable{

	private BufferedReader	reader;
	private Socket			socket;
	
	public SocketServerThread() {}
	
	public SocketServerThread(BufferedReader reader, Socket socket) {
		this.reader = reader;
		this.socket = socket;
	}
	
	@Override
	public void run() {
		String msg = null;
		try {
			while(true) {
				msg = reader.readLine();
				System.out.println("from " + socket.getRemoteSocketAddress() + ">> " + msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (socket != null)
					socket.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
}
