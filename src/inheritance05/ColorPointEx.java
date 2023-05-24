package inheritance05;

// 클래스 상속
class Point { // 슈퍼 클래스
    private int x, y; // 좌표
    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.printf("(%d, %d)\n", x, y);
    }
}

class ColorPoint extends Point { // 상속 선언. 서브클래스
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint(); // 서브 클래스에서 슈퍼 클래스 멤버에 접근
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        Point p = new Point(); // 슈퍼 클래스 객체 생성
        p.set(1, 2);
        p.showPoint();

        ColorPoint cp = new ColorPoint(); // 서브 클래스 객체 생성
        cp.set(3, 4); // 서브 클래스에서 슈퍼 클래스의 public 멤버 호출
        cp.setColor("red");
        cp.showColorPoint(); // 서브 클래스 객체 활용(서브클래스의 public 멤버 호출)
    }
}