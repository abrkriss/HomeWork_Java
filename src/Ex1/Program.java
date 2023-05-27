package Ex1;

public class Program {
    public static void main(String[] args) {
        Owner Kristina = new Owner("Kristina");
        Owner Tom = new Cat("Tom", 5, Kristina);
        Owner Masha = new Owner("Masha");
        Owner Rita = new Cat("Rita",10, Masha );


        ((Cat) Tom).SayMeow();
        ((Cat)Rita).SayMeow();
    }
}
