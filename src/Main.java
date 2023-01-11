
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев Толстой");
        Author author2 = new Author("Александр Пушкин");

        Book book1 = new Book("Война и мир", author1, 1865);
        Book book2 = new Book("Капитанская дочка", author2, 1837);

        book2.setYearOfPublication(1836);

        System.out.println("Название книги - " + book1.getTitleOfTheBook() + ", автор книги - "
                + author1.getName() + ", год публикациии - " + book1.getYearOfPublication() + ".");
        System.out.println("Название книги - " + book2.getTitleOfTheBook() + ", автор книги - "
                + author2.getName() + ", год публикациии - " + book2.getYearOfPublication() + ".");
    }
}
