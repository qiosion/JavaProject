package basic02;

public class AssignmentIncDecOperator {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 3;

        // 대입연산자
        a += 3; // 6
        b *= 3; // 9
        c %= 2; // 1
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);

        // 증감연산자
        int d = 3;
        a = d++; // a 에 d의 현재값(3) 대입하여 계산한 후, d 값이 +1됨(4)
        System.out.printf("a = %d, d = %d\n", a, d); // 3, 4

        a = ++d; // a에 d의 현재값(4)에 +1하여 계산
        System.out.printf("a = %d, d = %d\n", a, d); // 5, 5

        a = d--; // a에 d의 현재값(5) 대입하여 계산 후, d 값이 -1됨(4)
        System.out.printf("a = %d, d = %d\n", a, d); // 5, 4

        a = --d; // a에 d의 현재값(4)에 -1하여 계산
        System.out.printf("a = %d, d = %d\n", a, d); // 3, 3
    }
}
