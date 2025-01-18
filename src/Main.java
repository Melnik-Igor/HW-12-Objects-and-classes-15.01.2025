public class Main {
    public static void main(String[] args) {
        //авторы
        Author author1 = new Author("Joshua", "Foer");
        Author author2 = new Author("Ray", "Bradbury");
        //книги
        Book book1 = new Book("Atlas Obscura", author1, 2019);
        Book book2 = new Book("451 градус по Фаренгейту", author2, 1953);
        System.out.println(book1);
        System.out.println(book2);
        //изменяем год публикации
        book1.setPublicationYear(2022);
        System.out.println("После изменения года публикации:");
        System.out.println(book1);



    }
}