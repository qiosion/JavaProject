package reviewing;

import java.util.Scanner;

// 2.6 조건문
public class ch2_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("점수를 입력하시오");

        int score = scn.nextInt();

        if (score >= 80) {
            System.out.println("합격");
        }
        scn.close();
    }
}
