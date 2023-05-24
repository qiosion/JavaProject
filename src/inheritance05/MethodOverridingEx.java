package inheritance05;

class Shape0524 {
    public Shape0524 next;
    public Shape0524() {
        next = null;
    }
    public void draw() {
        System.out.println("Shape");
    }
}

class Line0524 extends Shape0524 {
    public void draw() { // 메서드 오버라이딩
        System.out.println("Line");
    }
}

class Rect0524 extends Shape0524 {
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle0524 extends Shape0524 {
    public void draw() {
        System.out.println("Circle");
    }
}


public class MethodOverridingEx {
    static void paint(Shape0524 p) {
        p.draw(); // p가 가리키는 객체 내에 오버라이딩된 draw() 호출. 동적 바인딩
    }
    public static void main(String[] args) {
        Line0524 line = new Line0524();

        // 다음 호출들은
        // 모두 paint() 메서드 내에서 Shape0524 에 대한 레퍼런스 p로 업캐스팅
        paint(line); // Line : Line에 오버라이딩한 draw() 실행
        paint(new Shape0524()); // Shape : Shape의 draw() 실행
        paint(new Line0524()); // Line : Line에 오버라이딩한 draw() 실행
        paint(new Rect0524()); // Rect : Rect에 오버라이딩한 draw() 실행
        paint(new Circle0524()); // Circle : Circle에 오버라이딩한 draw() 실행
    }
}
