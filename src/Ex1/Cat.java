package Ex1;

/**
 * Это класс котиков
 */
public class Cat extends Owner {
    private  int age;
    private Owner owner;

    /**
     * Это конструктор создания нового котика
     * @param name Имя котика
     * @param age Возраст котика
     * @param owner Владелец котика
     */
    public Cat(String name, int age, Owner owner ){
        super(name);
        this.age = age;
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * Это метод приветствия котика
     */
    public void SayMeow(){
        System.out.println("Meow! My name is " + getName() + "\n I am " + getAge() + "years old. My owner is " + getOwner());
    }
}
