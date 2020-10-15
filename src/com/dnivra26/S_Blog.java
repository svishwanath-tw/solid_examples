package com.dnivra26;

import java.io.FileWriter;

public class Blog {
    String title = "Microservices";
    String author = "Feynmann";

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void printBlog() {
        System.out.println("prints blog");
    }

    public void persist() {
        try {
            FileWriter fw = new FileWriter(getTitle() + "-" + getAuthor() + ".txt");
            fw.write(getTitle() + "-" + getAuthor());
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
