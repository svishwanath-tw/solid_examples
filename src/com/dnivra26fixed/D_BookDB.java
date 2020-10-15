public class D_BookDB {
    BookPersist bookPersist;
    public void save(Book book) {
        bookPersist.save(book);
    }
}

interface BookPersist {
    public void save(Book book);
}

class FilePersist implements BookPersist {

    @Override
    public void save(Book book) {
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