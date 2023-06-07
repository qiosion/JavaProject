package stream08;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        FileWriter fout = null;
        String str = "";

        try {
            fout = new FileWriter("output.txt"); // 예외처리 필요함

            for (int i = 1; i <= 10; i++) {
                str = i + " line \n";
                fout.write(str);
            }

            fout.close();

        } catch (IOException e) {
//            throw new RuntimeException(e);
            System.out.println("스트림 생성 오류");
        }
    }
}
