package reviewing;

import java.util.Scanner;

// 아 중첩 조건문으로 하드코딩해야하네.. 패스!
public class ch2_challenge {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("가위바위보 게임");
        System.out.print(">>> 철수");
        String cs = scn.next();
        System.out.print(">>> 영희");
        String yh = scn.next();

        scn.close();
    }
}
