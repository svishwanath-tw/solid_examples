package com.dnivra26fixed;


import com.dnivra26.D_Book;
import java.io.FileWriter;

public class D_BookDB {
    BookPersist bookPersist;
    public void save(D_Book book) {
        bookPersist.save(book);
    }
}

interface BookPersist {
    public void save(D_Book book);
}

class FilePersist implements BookPersist {
    @Override
    public void save(D_Book book) {
        try {
            FileWriter fw = new FileWriter("books.txt");
            fw.write(book.getTitle() + "-" + book.getAuthor());
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
    }
}