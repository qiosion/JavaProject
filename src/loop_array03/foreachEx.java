package loop_array03;

public class foreachEx {
    enum Week { 월, 화, 수, 목, 금, 토, 일 }
    public static void main(String[] args) {
        // enum 나열타입
        for (Week day : Week.values()) {
            System.out.print(day + "요일 ");
        }
        System.out.println();

        // 정수 배열
        int[] n = {1, 2, 3, 4, 5};

        int sum = 0;
        for (int k : n) {
            System.out.print(k + " ");
            sum += k;
        }
        System.out.println("합은 " + sum);

        // 문자열 배열
        String[] names = {"홍길동", "이순신", "세종대왕"};

        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
