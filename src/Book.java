/**
 * ➢ Book class includes
 * ▪ Schools
 * • String id: Book code (starts with “B”, 4 characters long, unique)
 * • String title: Book title (from 6-50 characters, unique)
 * • String author: Author name (not blank)
 * • String publisher: Publisher (do not leave blank)
 * • int year: Year of publication (minimum since 1970 and not greater than the current year)
 * • String description: Description of the book (do not leave blank)
 * • int categoryId: Book category code (must be taken from the previously saved Book Category list)
 * ▪ Get/set methods
 * ▪ Constructors have parameters and no parameters
 * ▪ Implement the IEntity interface and implement the methods
 * • input(): Enter Book information, validate input information. All information must not be left blank and validated according to each field described above.
 * • output(): Displays book information including book code, title, author, publisher, year of publication, genre (displays book genre name according to genre code when entering).
 */

package main;

import java.util.Scanner;
import main.IEntity;

public class Book implements IEntity {
    private String id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private String description;
    private int categoryId;
    public Book() {
    }
    public setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }
    public setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book information: ");
        System.out.println("Enter Book code: ");
        id = sc.nextLine();
        System.out.println("Enter Book title: ");
        title = sc.nextLine();
        System.out.println("Enter Author name: ");
        author = sc.nextLine();
        System.out.println("Enter Publisher: ");
        publisher = sc.nextLine();
        System.out.println("Enter Year of publication: ");
        year = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Description of the book: ");
        description = sc.nextLine();
        System.out.println("Enter Book category code: ");
        categoryId = Integer.parseInt(sc.nextLine());
    }
    public void output() {
        System.out.println("Book code: " + id);
        System.out.println("Book title: " + title);
        System.out.println("Author name: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year of publication: " + year);
        System.out.println("Description of the book: " + description);
        System.out.println("Book category code: " + categoryId);
    }
}


