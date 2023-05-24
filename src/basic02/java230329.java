package basic02;

import java.util.Scanner;

public class java230329 {
    public static void main(String[] args) {
        // 스캐너
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        String city = scanner.next();

        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        boolean isSingle = scanner.nextBoolean();

        System.out.println(name);
        System.out.println(city);
        System.out.println(age);
        System.out.println(weight);
        System.out.println(isSingle);
    }
}
