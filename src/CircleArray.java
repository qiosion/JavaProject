class Circle0503 {
    int radius;

    // 생성자
    public Circle0503(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}

public class CircleArray {
    public static void main(String[] args) {
        Circle0503 [] c; // 배열에 대한 레퍼런스 선언
        c = new Circle0503[5]; // 레퍼런스 배열 생성

        for (int i = 0; i < c.length; i++) {
            c[i] = new Circle0503(i); // 배열의 원소 객체 생성
            System.out.print((int)(c[i].getArea()) + " "); // 객체 배열 사용
        }
    }
}
