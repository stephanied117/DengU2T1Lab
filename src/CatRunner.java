public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Elmo", 3, 2.3);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("World", 1000000000, 1000000000);
        cat2.introduce();
        cat2.printCatInfo();

    }
}
