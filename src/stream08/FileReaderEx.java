package stream08;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fin = null;
        int c;

        try {
            fin = new FileReader("./src/stream08/문자스트림.txt"); // 스트림 생성

            // fin.read() : 파일 한줄씩 읽어오기
            while ((c = fin.read()) != -1) { // 읽어온 것이 끝줄(EOF)이 아닐 경우
                // 파일의 맨 마지막이 되면 -1이 되는 것을 이용

                System.out.print((char)c); // 형변환
            }

            fin.close();
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("파일을 읽어올 수 없음");
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("스트림 생성 오류");
        }
    }
}
