package stream08;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        String str = "";
        byte [] strToByte;

        try {
            fout = new FileOutputStream("./src/stream08/바이트스트림.txt");

            for (int i = 1; i <= 10; i++) {
                str = i + " line\n";
                strToByte = str.getBytes();
                fout.write(strToByte); // 바이트타입 write 할때는 배열로 넣어야 함
                // 그러므로 byte 형식의 배열을 만들어주고
                // 문자열의 바이트를 배열에 하나씩 넣어줌

            }
            fout.close();
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("파일을 읽어올 수 없음");
        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("스트림 생성 오류");
        }
    }
}
