
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев Толстой");
        Author author2 = new Author("Александр Пушкин");
        Author author3 = new Author("Лев Толстой");

        Book book1 = new Book("Война и мир", author1, 1865);
        Book book2 = new Book("Капитанская дочка", author2, 1837);
        Book book3 = new Book("Война и мир", author3, 1867);

        book2.setYearOfPublication(1836);

        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author3);

        System.out.println(author1.equals(author2));
        System.out.println(author2.equals(author3));
        System.out.println(author1.equals(author3));

        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(author3.hashCode());


        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        /*
 Объекты типа Book принял равными для метода equals при условии совпадения названия книги и автора,
  год публикации оставил произвольным.
*/
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        System.out.println(book1.equals(book3));

        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());
    }
}
