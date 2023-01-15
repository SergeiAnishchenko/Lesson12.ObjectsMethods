public class Book {
    private String titleOfTheBook;
    private Author author;
    private int yearOfPublication;

    public Book(String titleOfTheBook, Author author, int yearOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleOfTheBook() {
        return titleOfTheBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return titleOfTheBook.equals(book.titleOfTheBook) && author.getName().equals(book.author.getName());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(titleOfTheBook, author.getName());
    }

    @Override
    public String toString() {
        return "Название книги - " + titleOfTheBook + ", автор книги - "
                + getAuthor().toString() + ", год публикациии - " + yearOfPublication + ".";
    }
}
