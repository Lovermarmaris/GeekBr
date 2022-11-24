package com.lovermarmaris;
public class Bowl {
    protected int foodInBowlNow;

    protected Bowl(int _maxVolume, int _foodInBowlNow){
        foodInBowlNow = _foodInBowlNow;
    }
    protected void putFoodInBowl(int volumeFoodToPut){
        foodInBowlNow = foodInBowlNow + volumeFoodToPut;
    }
    protected int foodInBowlNowInfo(){
        return foodInBowlNow;
    }
}