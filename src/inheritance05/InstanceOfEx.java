package inheritance05;

class Person230524 { }
class Student230524 extends Person230524 { }
class Researcher230524 extends Person230524 { }
class Professor230524 extends Researcher230524 { }

public class InstanceOfEx {
    static void print(Person230524 p) {
        if (p instanceof Person230524) {
            System.out.print("Person ");
        }
        if (p instanceof Student230524) {
            System.out.print("Student ");
        }
        if (p instanceof Researcher230524) {
            System.out.print("Researcher ");
        }
        if (p instanceof Professor230524) {
            System.out.print("Professor ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("new Student() -> \t");
        print(new Student230524()); // new Student() -> 	Person Student

        System.out.print("new Researcher() -> \t");
        print(new Researcher230524()); // new Researcher() -> 	Person Researcher

        System.out.print("new Professor() -> \t");
        print(new Professor230524()); // new Professor() -> 	Person Researcher Professor

    }
}
