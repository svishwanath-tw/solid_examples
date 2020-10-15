package com.dnivra26fixed;

import java.io.FileWriter;

public class S_Blog {
    String title = "Microservices";
    String author = "Feynmann";

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}

interface Printer {
    public void print(S_Blog Blog);
}

class CLIPrinter implements Printer {

    @Override
    public void print(S_Blog blog) {
        System.out.println(blog.getAuthor() + "-" + blog.getTitle());
    }
}

interface Persist {
    public void save(S_Blog blog);
}

class BFilePersist implements Persist {

    @Override
    public void save(S_Blog blog) {
        try {
            FileWriter fw = new FileWriter(blog.getTitle() + "-" + blog.getAuthor() + ".txt");
            fw.write(blog.getTitle() + "-" + blog.getAuthor());
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}