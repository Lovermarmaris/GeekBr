public class Bowl {
    private int volumeBowl;
    protected static int foodInBowlNow;

    protected Bowl(int _volume, int _foodInBowlNow){
        this.volumeBowl = _volume;
        foodInBowlNow = _foodInBowlNow;
    }
    protected void putFoodInBowl(int volumeFoodToPut){
        foodInBowlNow = foodInBowlNow + volumeFoodToPut;
    }
    protected int foodInBowlNowInfo(){
        return foodInBowlNow;
    }
}