package reviewing;

import java.util.Scanner;

public class ch2_ex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /*
        // 9번
        System.out.print("원의 중심과 반지름 >>>");
        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        double r = scn.nextDouble();

        System.out.print("점 입력 >>>");
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();


        if ((x1+r > x2) & (x1-r < x2) & (y1+r > y2) & (y1-r < y2)) {
            System.out.println("원 안에 있음");
        } else {
            System.out.println("아님");
        }
         */

        // 10번
        System.out.print("원1의 중심과 반지름 >>>");
        double x1 = scn.nextDouble();
        double y1 = scn.nextDouble();
        double r1 = scn.nextDouble();

        System.out.print("원2의 중심과 반지름 >>>");
        double x2 = scn.nextDouble();
        double y2 = scn.nextDouble();
        double r2 = scn.nextDouble();

        double z = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        double r = r1 + r2;

        if (r > z) {
            System.out.println("겹친다");
        } else {
            System.out.println("아님");
        }
    }
}
