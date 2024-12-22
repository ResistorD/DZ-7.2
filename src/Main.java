//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Домашка 7.1");

        Author author1 = new Author("Александр", "Пушкин");
        Author author2 = new Author("Лев", "Толстой");

        Book book1 = new Book("Евгений Онегин", author1, 1833);
        Book book2 = new Book("Война и мир", author2, 1869);

        System.out.println("Книга: " + book1.getTitle() + ", Автор: " +
                book1.getAuthor().getFirstName() + " " +
                book1.getAuthor().getLastName() + ", Год: " +
                book1.getPublicationYear());

        System.out.println("Книга: " + book2.getTitle() + ", Автор: " +
                book2.getAuthor().getFirstName() + " " +
                book2.getAuthor().getLastName() + ", Год: " +
                book2.getPublicationYear());

        book1.setPublicationYear(1834);
        System.out.println("Измененный год публикации книги \"" + book1.getTitle() + "\": " +
                book1.getPublicationYear());
    }
}