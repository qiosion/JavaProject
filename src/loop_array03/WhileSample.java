package loop_array03;

import java.util.Scanner;

public class WhileSample {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1를 입력하세요.");

        int n = scanner.nextInt(); // 정수입력
        while (n != -1) { // -1이 아닐 경우에 while문을 반복한다
            sum += n; // sum = sum + n
            count++;
            n = scanner.nextInt(); // 다음 정수입력
        }
        if (count == 0) {
            System.out.println("입력된 수가 없습니다");
        } else {
            System.out.printf("정수의 개수는 %d개 이며, 평균은 %f입니다",
                    count, (double)sum/count);
        }
        scanner.close();
    }
}
