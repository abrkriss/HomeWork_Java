package Ex3;

import java.util.ArrayList;
import java.util.List;

//Класс "Библиотека" (Library):
//
// Приватное поле "каталог" (catalog) типа ArrayList<Book> для хранения списка книг в библиотеке.
// Публичный метод "добавить книгу" (addBook), который принимает объект типа Book и добавляет его в каталог библиотеки.
// Публичный метод "удалить книгу" (removeBook), который принимает объект типа Book и удаляет его из каталога библиотеки.
// Публичный метод "показать доступные книги" (displayAvailableBooks),
// который выводит на консоль информацию о доступных книгах в библиотеке.
// Публичный метод "поиск книги по автору" (searchByAuthor),
// который принимает имя автора в качестве параметра и выводит на консоль информацию о книгах данного автора,
// находящихся в каталоге библиотеки.
public class Library {
    private List<Book> catalog;

    public Library(){
        this(new ArrayList<>());
    }
    public Library(List<Book> catalog){
        this.catalog = catalog;
    }
    public boolean addBook(Book book){
        if(book == null){
            return false;
        }
        if (!catalog.contains(book)) {
            catalog.add(book);
        }
        return true;
    }

    public void removeBook(Book book){
        if(catalog.contains(book)){
            catalog.remove(book);
        }
        else System.out.print("Каталог не содержит книгу!");
    }

    public Book searchByAuthor(String author){
        for (Book book: catalog) {
            if(book.getAuthor().equals(author)){
                return book;
            }
        }return null;
    }



    public String displayAvailableBooks(){
        StringBuilder sb = new StringBuilder();
        sb.append("В каталоге ");
        sb.append(catalog.size());
        sb.append(" книг \n");
        for(Book book:catalog){
            sb.append(book.displayInfo());
        }return sb.toString();
    }
}
