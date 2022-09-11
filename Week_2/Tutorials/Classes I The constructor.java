class Book {

    String title;
    String author;
    long isbn;

    public Book(String title, String author, long isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public long getISBN() {
        return this.isbn;
    }

}