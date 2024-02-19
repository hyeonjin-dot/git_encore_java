import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SocketClientMain {

	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		try {
			socket = new Socket("192.168.0.85", 7777);
			System.out.println(socket + " 연결됨...");
			//소켓을 통해 서버와 연결된 스트림을 만들어 놓는 작업
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			// 클라이언트 메세지를 얻기 위해서 만든 스트림 
			Scanner scan = new Scanner(System.in);
			while(true){
				System.out.print("send msg >>> ");
				String msg = scan.nextLine();
				bw.write(msg);
				bw.newLine();
				bw.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (socket != null)
					socket.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
