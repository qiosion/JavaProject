package basic02;

public class SwitchCase {
    public static void main(String[] args) {
        int score = 92;
        // if - else 문
        if (score >= 90 && score <= 100) {
            System.out.println("A학점");
        } else if (score >= 80) {
            System.out.println("B학점");
        } else if (score >= 70) {
            System.out.println("C학점");
        } else if (score >= 60) {
            System.out.println("D학점");
        } else {
            System.out.println("F학점");
        }

        // switch - case 문
        // 점수는 0 ~ 100 점 -> 구간을 나눠보면?
        int value = score / 10; // 자바의 나누기는 몫만 남는다는 점을 이용
        switch (value) {
            case 10:
                // 90점 이상은 A학점이니 case 10에서 출력+break 해주지 않아도 됨
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
                System.out.println("D학점");
                break;
            default:
                System.out.println("F학점");
        }
    }
}
