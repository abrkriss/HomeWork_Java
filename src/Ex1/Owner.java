package Ex1;

/**
 * Это класс владельца котиков
 */
public class Owner {
    String name;

    public Owner(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
