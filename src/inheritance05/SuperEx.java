package inheritance05;

class Point0524 {
    private int x, y;
    public Point0524(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void showPoint() {
        System.out.printf("(%d, %d)\n", x, y);
    }
}

class ColorPoint0524 extends Point0524 {
    private String color; // 점의 색
    public ColorPoint0524(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    public void showColorPoint() {
        System.out.print(color);
        showPoint();
    }
}

public class SuperEx {
    public static void main(String[] args) {
        ColorPoint0524 cp = new ColorPoint0524(5, 6, "blue");
        cp.showColorPoint();
    }
}
