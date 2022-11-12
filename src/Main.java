public class Main {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Sharik");
        dog1.animalInfo();
        System.out.print(" is runnig " + dog1.run(222));
        System.out.print(" is jumping " + dog1.jump(10));
        System.out.print(" is swimming " + dog1.swim(10) + "\n");
        Animal cat1 = new Cat("Barsik");
        cat1.animalInfo();
        System.out.print(" is runnig " + cat1.run(130));
        System.out.print(" is jumping " + cat1.jump(2));
    }
}