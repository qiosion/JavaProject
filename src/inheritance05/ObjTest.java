package inheritance05;

public class ObjTest {
    public static void main(String[] args) {
        Animal obj1 = new Animal(); // 부모클래스인 inheritance05.Animal 의 객체
        obj1.name = "lion";
        obj1.age = 4;

        Human obj2 = new Human(); // 자식클래스인 inheritance05.Human 의 객체
        obj2.hobby = "soccer";
        obj2.job = "programmer";

        // 부모로부터 상속받은 것들에도 접근 가능
        obj2.name = "bear";
        obj2.age = 8;
    }
}

class Animal {
    String name;
    int age;

    void eat() {
        System.out.println("먹기");
    }

    void sleep() {
        System.out.println("자기");
    }

    void love() {
        System.out.println("❤❤");
    }

    // 생성자
    public Animal() {
        System.out.println("안녕");
    }
} // end of inheritance05.Animal

// inheritance05.Animal 클래스로부터 상속받는 inheritance05.Human 클래스
class Human extends Animal {
    String hobby;
    String job;

    void work(){
        System.out.println("일해");
    }

    void cry(){
        System.out.println("ㅠㅡㅠ");
    }

} // end of inheritance05.Human