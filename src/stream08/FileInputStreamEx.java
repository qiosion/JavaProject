package stream08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        FileInputStream fin = null;
        int c;

        try {
            fin = new FileInputStream("./src/stream08/바이트스트림.txt");

            while ((c = fin.read()) != -1) { // 파일 끝에 가기 전까지는..
                // End Of File 일 경우 -1이 된다는 것을 이용

                System.out.print((char)c);
            }
            fin.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일을 읽어올 수 없음");
        } catch (IOException e) {
            System.out.println("스트림 생성 오류");
        }
    }
}
