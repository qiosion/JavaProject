package reviewing;

import java.util.Scanner;

public class ch2_11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        if (num % 3 == 0) {
            System.out.println("3의 배수");
        } else {
            System.out.println("3의 배수 아님");
        }
        scn.close();
    }
}
