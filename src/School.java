/*
▪ Schools
• int id: Category code (integer greater than 0, unique)
• String name: Category name (no duplicates, 6-30 characters)
• boolean status: Category status (only receives true/false when entering)
▪ Get/set methods
▪ Constructors have parameters and no parameters
▪ Implement the IEntity interface and implement the methods
• input(): Enter Category information, validate input information. All information must not be left blank and validated according to each field described above.
• output(): Displays book information including genre code, name, status (true:
Active, false: Inactive.
 */
package main;

public class School implements IEntity {
    private int id;
    private String name;
    private boolean status;

    public School() {
    }
    