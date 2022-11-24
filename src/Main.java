public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 12);
        cat1.catInfo();
        Bowl bowl1 = new Bowl(20, 0);
        bowl1.putFoodInBowl(20);
        System.out.println("В миске сейчас еды " + bowl1.foodInBowlNowInfo());
        System.out.println("Пробуем накормить кота");
        System.out.println(cat1.toFeed());
        System.out.println("В миске осталось еды после кормешки: " + bowl1.foodInBowlNowInfo());

        Cat cat2 = new Cat("Kokos", 10);
        cat2.catInfo();
        Bowl bowl2 = new Bowl(15,3);
        bowl2.putFoodInBowl(2);
        System.out.println("В миске сейчас еды " + bowl2.foodInBowlNowInfo());
        System.out.println("Пробуем накормить кота");
        System.out.println(cat2.toFeed());
        System.out.println("В миске осталось еды после кормешки: " + bowl2.foodInBowlNowInfo());
    }
}