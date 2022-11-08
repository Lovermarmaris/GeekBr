class Cat extends Animal {
    private final int maxForRun = 200;
    private final int maxForJump = 2;

    public Cat(String _name) {
        super(_name);
    }

    protected boolean run(int distance) {
        super.max = maxForRun;
        super.distance = distance;
        return super.isCan();
    }

    public boolean jump(int distance) {
        super.max = maxForJump;
        super.distance = distance;
        return super.isCan();
    }

    public boolean swim(int distance) {
        return false;
    }
}