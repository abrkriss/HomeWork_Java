package Ex3;

//Реализуйте систему управления библиотекой.
// Создайте классы "Книга" (Book) и "Библиотека" (Library) со следующими свойствами и методами:
//  Класс "Книга" (Book):
// Приватные поля "название" (title) и "автор" (author) типа String для хранения названия и автора книги соответственно.
// Приватное поле "доступность" (available) типа boolean для указания доступности книги.
// Публичные методы доступа (геттеры и сеттеры) для полей "название" и "автор".
// Публичные методы доступа (геттеры и сеттеры) для поля "доступность".
// Публичный метод "показать информацию" (displayInfo), который выводит на консоль информацию о книге (название, автор, доступность).

public class Book {

    private String title;
    private String author;
    private boolean available;

    public Book(String title, String author){
        this.title = title;
        this.author = author;

    }
    public Book(String title, String author, boolean available){
        this.title = title;
        this.author = author;
        this.available = available;

    }
    public String getTitle() {

        return title;
    }
    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }


}
