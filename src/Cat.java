public class Cat {
    private final String name;
    private final int appetite;
    private boolean fullness = false;

    protected Cat(String _name, int _appetite) {
        name = _name;
        appetite = _appetite;
    }

    protected boolean toFeedCats(Bowl bowl1){
        if((bowl1.foodInBowlNow - appetite) >= 0){
            fullness = true;
            System.out.println(name + " ссытый");
            bowl1.foodInBowlNow = bowl1.foodInBowlNow - appetite;
        } else {
            System.out.println(name + " голодный! Добавьте еды в миску");
        } return fullness;
    }
}