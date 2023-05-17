// 상속 + 접근지정자
class Person230517 {
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    public void show() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age + "세");
        System.out.println("키 : " + this.height + "cm");
        System.out.println("몸무게 : " + this.weight + "kg");
    }
}

class Student230517 extends Person230517 {
    public void set() {
        age = 30;
        name = "홍길동";
        height = 175;
        // weight = 63; // super class 의 private 멤버에 접근 불가
        setWeight(63);
    }
}


public class InheritanceEx {
    public static void main(String[] args) {
        Student230517 s = new Student230517();
        s.set();
        s.show();
    }
}
