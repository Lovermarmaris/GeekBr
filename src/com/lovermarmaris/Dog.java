package com.lovermarmaris;
class Dog extends Animal {
    private final int MAX_FOR_RUN = 500;
    private final int MAX_FOR_SWIM = 10;
    private final int MAX_FOR_JUMP = 5;

    protected Dog(String _name) {
        super(_name);
    }

    protected boolean run(int distance) {
        super.max = MAX_FOR_RUN;
        super.distance = distance;
        return super.isCan();
    }

    protected boolean jump(int distance) {
        super.max = MAX_FOR_JUMP;
        super.distance = distance;
        return super.isCan();
    }

    protected boolean swim(int distance) {
        super.max = MAX_FOR_SWIM;
        super.distance = distance;
        return super.isCan();
    }
}