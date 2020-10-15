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

}

interface Printer {
    public void print(Blog blog);
}

class CLIPrinter implements Printer {

    @Override
    public void print(Blog blog) {
        System.out.println(blog.getAuthor() + "-" + blog.getTitle());
    }
}

interface Persist {
    public void save(Blog blog);
}

class FilePersist implements Persist {

    @Override
    public void save(Blog blog) {
        try {
            FileWriter fw = new FileWriter(blog.getTitle() + "-" + blog.getAuthor() + ".txt");
            fw.write(blog.getTitle() + "-" + blog.getAuthor());
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}