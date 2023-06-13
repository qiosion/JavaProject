package reviewing;

import java.util.Random;
import java.util.Scanner;

public class ch3_ex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*
        // 2번
        int [][] n = {{1}, {1,2,3}, {1}, {1,2,3,4}, {1,2}};
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + "\t");
            }
            System.out.println();
        }
        */

        /*
        // 3번 역별찍기
        System.out.print("정수 입력 >>> ");
        int num = scn.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 오른쪽 정렬 별찍기 : i 와 j, 부등호 주의 !!
        for (int i = 1; i <= num; i++) {
            for (int j = num-1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 오른쪽 정렬 역별찍기
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = num; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 피라미드 찍기
        for (int i = 1; i <= num; i++) {
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // 혹시 오른쪽 공백도 필요한 경우
            for (int j = num; j > i; j--) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }

        // 역 피라미드 찍기
        for (int i = num; i >= 1; i--) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        // 4번
        System.out.print("소문자 하나를 입력하세요: ");
        char ch = scn.nextLine().charAt(0);

        int n = ch - 'a' + 1;

        for (int i = n; i >= 1; i--) {
            for (char c = 'a'; c <= (char) (c + i - 1); c++) {
                System.out.print(c);
            }
            System.out.println();
        }
        */

        /*
        // 5번
        int[] numbers = new int[10];

        System.out.println("양의 정수 10개를 입력하세요:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
        }

        System.out.println("입력한 정수 중 3의 배수:");

        for (int number : numbers) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
         */

        /*
        // 7번
        int[] numbers = new int[10];
        Random random = new Random();

        // 1에서 10까지 범위의 랜덤한 정수 생성 및 배열에 저장
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10) + 1;
        }

        // 배열 숫자 출력
        System.out.println("배열 숫자:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 평균 계산
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;

        // 평균 출력
        System.out.println("평균: " + average);
         */

        // 10 4x4 의 2차원 배열. 1~10 랜덤한 정수 10개 임의의 위치에 삽입
        int[][] array = new int[4][4];
        int count = 0;

        // 10개의 정수를 랜덤하게 생성하여 배열에 삽입
        Random random = new Random();
        while (count < 10) {
            int num = random.nextInt(10) + 1;
            int row = random.nextInt(4);
            int col = random.nextInt(4);

            if (array[row][col] == 0) {
                array[row][col] = num;
                count++;
            }
        }

        // 배열 출력
        for (int[] row : array) {
            for (int num : row) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }

        // 13 369게임
        for (int i = 1; i <= 99; i++) {
            String result = "";
            String number = String.valueOf(i);

            // 숫자에 3, 6, 9가 포함되어 있는지 확인
            int count369 = 0;
            for (int j = 0; j < number.length(); j++) {
                char digit = number.charAt(j);
                if (digit == '3' || digit == '6' || digit == '9') {
                    count369++;
                }
            }

            // 결과 문자열 생성
            if (count369 > 0) {
                if (count369 > 1) {
                    result = "짝짝";
                } else {
                    result = "짝";
                }
            }

            // 결과 출력
            if (!result.isEmpty()) {
                System.out.println(number + " " + result);
            }
        }



        scn.close();
    }
}
