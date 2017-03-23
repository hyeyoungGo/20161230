package Day8;

import java.io.*;

public class WriteToFile {
	static FileOutputStream fout;
	public static void main(String args[]) {
		try{
			int byteRead;
			byte[] buffer = new byte[256];
			fout = new FileOutputStream("이야호.txt");
			while((byteRead = System.in.read(buffer)) >= 0) {
				fout.write(buffer, 0, byteRead);
			}    // 키보드로부터 데이터 입력 -> 메모리 저장 -> 파일로 저장
		} catch(IOException e) {
			System.err.println("스트림으로부터 데이터를 읽을 수 없습니다.");
		} finally {
			try {
				if(fout!=null) fout.close();
				} catch(IOException e) {}
		}
	}
}
