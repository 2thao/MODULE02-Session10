/**
 * class Category includes:
 * ▪ Schools
 * • int id: Category code (integer greater than 0, unique)
 * • String name: Category name (no duplicates, 6-30 characters)
 * • boolean status: Category status (only receives true/false when entering)
 * ▪ Get/set methods
 * ▪ Constructors have parameters and no parameters
 * ▪ Implement the IEntity interface and implement the methods
 * • input(): Enter Category information, validate input information. All information must not be left blank and validated according to each field described above.
 * • output(): Displays book information including genre code, name, status (true:Active, false: Inactive.) 
*/
package main;
import java.util.Scanner;
import main.IEntity;

public class Category implements IEntity{
    int id;
    String name;
    boolean status;
    public Category() {
    }
    public Category(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
    public int getId() {
        return id;
    }
    public int setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String setName(String name) {
        this.name = name;
    }
    public boolean getStatus() {
        return status;
    }
    public boolean setStatus(boolean status) {
        this.status = status;
    }
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Category information: ");
        System.out.println("Enter Category code: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Category name: ");
        name = sc.nextLine();
        System.out.println("Enter Category status: ");
        status = Boolean.parseBoolean(sc.nextLine());
    }
    public void output() {
        System.out.println("Category code: " + id);
        System.out.println("Category name: " + name);
        System.out.println("Category status: " + (status ? "Active" : "Inactive"));
    }
}