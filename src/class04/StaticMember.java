package class04;

import java.util.Scanner;

// static 을 이용한 환율 계산기
class CurrencyConverter {
    private static double rate; // 1$에 대한 원화
    public static double toDollar(double won) {
        return won / rate; // 원화 -> 달러
    }
    public static double toKWR(double dollar) {
        return dollar * rate; // 달러 -> 원
    }
    public static void setRate(double r) {
        rate = r; // 환율설정 : 원 / 달러
    }
}

public class StaticMember {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("환율(1달러)>> ");
        double rate = scanner.nextDouble();

        CurrencyConverter.setRate(rate); // 환율 설정

//        System.out.printf("백만원은 $%f입니다\n", class04.CurrencyConverter.toDollar(1000000));
        System.out.println("백만원은 $" + CurrencyConverter.toDollar(1000000) + "입니다");
        System.out.println("$100는 " + CurrencyConverter.toKWR(100) + "원입니다");
    }
}
