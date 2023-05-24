package loop_array03;

import java.util.Scanner;

public class ArrayLength {
    public static void main(String[] args) {
        int[] intArray = new int[5];
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(intArray.length + "개의 정수를 입력하시오 >>"); // 스페이스바로 구분, 엔터로 끝
        // 아무리 많이 적어도 5개만 배열에 들어감
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < intArray.length; i++) {
            sum += intArray[i]; // 배열에 저장된 정수값  더하기
        }
        System.out.println("평균은 " + (double)sum/intArray.length);
        scanner.close();
    }
}
