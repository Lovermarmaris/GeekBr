public class Cat {
    private final String name;
    private static int appetite;
    private boolean fullness = false;

    protected Cat(String _name, int _appetite) {
        name = _name;
        appetite = _appetite;
    }

    protected void catInfo() {
        System.out.println("Имя " + name + " Аппетит " + appetite);
    }

    protected boolean toFeed() {
        if (Bowl.foodInBowlNow - appetite > 0) {
            Bowl.foodInBowlNow = Bowl.foodInBowlNow - appetite;
            this.fullness = true;
            System.out.println("Кот сытый");
        } else {
            System.out.println("В миске мало еды для кота! Кот голодный!");
        }
        return fullness;
    }
}