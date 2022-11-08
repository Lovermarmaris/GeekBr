public abstract class Animal {
    protected String name;
    protected int max;
    protected int distance;
    protected abstract boolean run(int distance);
    protected abstract boolean jump(int distance);
    protected abstract boolean swim(int distance);
    public Animal(String _name) {
        this.name = _name;
    }
    public void animalInfo() {
        System.out.println("Animal: " + this.name);
    }
    protected boolean isCan() {
        boolean result = true;
        if (this.distance > this.max) {
            result = false;
        }
        return result;
    }
}
