package class04;

import java.util.Scanner;

class Book0503 {
    String title;
    String author;

    public Book0503(String title, String author) {
        this.title = title;
        this.author = author;
    }

}
public class BookArray {
    public static void main(String[] args) {
        Book0503 [] book = new Book0503[2];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < book.length; i++) {
            System.out.print("제목 >>>");
            String title = sc.nextLine();
            System.out.print("저자 >>>");
            String author = sc.nextLine();
            book[i] = new Book0503(title, author);
        }

        for (int i = 0; i < book.length; i++) {
            System.out.print("( " + book[i].title + ", " + book[i].author + " )");
        }
    }
}
