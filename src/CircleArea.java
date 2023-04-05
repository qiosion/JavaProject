public class CircleArea {
    public static void main(String[] args) {
        // 상수
        final double PI = 3.14;

        double radius = 10; // 반지름
        double circleArea = radius * radius * PI; // 원 면적
        System.out.println("원 면적 : " + circleArea);
        System.out.printf("반지름 %.1f인 원의 면적은 %.1f\n", radius, circleArea);
    }
}
