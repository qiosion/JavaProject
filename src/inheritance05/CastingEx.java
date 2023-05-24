package inheritance05;

class Person0524 {
    String name;
    String id;

    public Person0524(String name) {
        this.name = name;
    }
}
class Student0524 extends Person0524 {
    String grade;
    String department;

    public Student0524(String name) {
        super(name);
    }
}

public class CastingEx {
    // 업캐스팅 Upcasting 예시
//    public static void main(String[] args) {
//        Person0524 p;
//        Student0524 s = new Student0524("유진");
//        p = s; // 업캐스팅
//
//        System.out.println(p.name); // 유진
//        /*
//        이하 컴파일 오류
//        p.grade = "A";
//        p.department = "ComSci";
//         */
//    }

    // 다운캐스팅 Downcasting 예시
    public static void main(String[] args) {
        Person0524 p = new Student0524("유진"); // 업캐스팅 발생
        Student0524 s;

        s = (Student0524) p; // 다운캐스팅

        System.out.println(s.name); // 오류 X
        s.grade = "A"; // 오류 X
    }
}
