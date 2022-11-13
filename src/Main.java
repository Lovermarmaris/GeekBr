public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[]{
                new Cat("Barsik", 12),
                (new Cat("Kokos", 6)),
                (new Cat("Lilu", 9)),
        };
        System.out.println("Пробуем накормить всех котов");
        Bowl bowl1 = new Bowl(20, 0);
        bowl1.putFoodInBowl(20);
        System.out.println("В миске сейчас еды " + bowl1.foodInBowlNowInfo());
        for (Cat i:cats){
            System.out.println(i.toFeedCats(bowl1));
        }
        System.out.println("В миске сейчас еды " + bowl1.foodInBowlNowInfo());
    }
}
