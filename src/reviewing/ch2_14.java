package reviewing;

import java.util.Scanner;

public class ch2_14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char grade;
        System.out.println("점수 :");

        int score = scn.nextInt();
        switch (score / 10) {
            // 90점 이상일 경우 A학점
            // case 에는 정수, 문자, 문자열만 가능함
            case 10:
            case 9:
                grade = 'A';
                break;
            // 이하 디폴트를 제외한 모든 case 에 break 필요함
            default:
                grade = 'F';
        }
        System.out.println("학점은 " + grade);
        scn.close();
    }
}
