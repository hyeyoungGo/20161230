package Day8;

import java.io.*;

public class WriteToFile {
	static FileOutputStream fout;
	public static void main(String args[]) {
		try{
			int byteRead;
			byte[] buffer = new byte[256];
			fout = new FileOutputStream("�̾�ȣ.txt");
			while((byteRead = System.in.read(buffer)) >= 0) {
				fout.write(buffer, 0, byteRead);
			}    // Ű����κ��� ������ �Է� -> �޸� ���� -> ���Ϸ� ����
		} catch(IOException e) {
			System.err.println("��Ʈ�����κ��� �����͸� ���� �� �����ϴ�.");
		} finally {
			try {
				if(fout!=null) fout.close();
				} catch(IOException e) {}
		}
	}
}
