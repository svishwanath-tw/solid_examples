package com.dnivra26;

import java.io.FileWriter;
import java.util.Stack;

public class D_Book {
    public String getTitle() {
        return "A Great Book";
    }

    public String getAuthor() {
        return "John Doe";
    }

    public void turnPage() {
        // pointer to next page
        Stack stack;
    }

    public void printCurrentPage() {
        System.out.println("current page content");
    }

    public String getLocation() {
        return "Shelf: 42" + "Row: 3A";
    }

    public void save() {
        try {
            FileWriter fw = new FileWriter("books.txt");
            fw.write(getTitle() + "-" + getAuthor());
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}

