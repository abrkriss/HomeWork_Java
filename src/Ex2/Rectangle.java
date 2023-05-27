package Ex2;
//Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height).
// Класс должен обладать следующими методами:
//
//        Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
//        Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
//        Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
//        Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
//        Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).
public class Rectangle {
    private int width;
    private int height;

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle(){
        width = 10;
        height = 5;
    }
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public void calculateArea(){
        System.out.println("Площадь " + getHeight() * getWidth() + " см2");
    }

    public void calculatePerimeter(){
        System.out.println("Периметр " + 2*(getHeight() + getWidth()) + " см");
    }

}
