class Dog extends Animal {
    private final int maxForRun = 500;
    private final int maxForSwim = 10;
    private final int maxForJump = 5;

    protected Dog(String _name) {
        super(_name);
    }

    protected boolean run(int distance) {
        super.max = maxForRun;
        super.distance = distance;
        return super.isCan();
    }

    protected boolean jump(int distance) {
        super.max = maxForJump;
        super.distance = distance;
        return super.isCan();
    }

    protected boolean swim(int distance) {
        super.max = maxForSwim;
        super.distance = distance;
        return super.isCan();
    }
}